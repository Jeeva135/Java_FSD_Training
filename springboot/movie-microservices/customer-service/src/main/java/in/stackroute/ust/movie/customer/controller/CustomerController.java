package in.stackroute.ust.movie.customer.controller;

import in.stackroute.ust.movie.customer.domain.Customer;
import in.stackroute.ust.movie.customer.dto.CustomerDto;
import in.stackroute.ust.movie.customer.dto.LoginDto;
import in.stackroute.ust.movie.customer.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    private CustomerDto convertEntityToDto(Customer customer){
        return new CustomerDto(customer.getId(), customer.getName(), customer.getEmail(), customer.getPassword());
    }

    private Customer convertDtoToEntity(CustomerDto customerDto){
        return new Customer(customerDto.id(), customerDto.name(), customerDto.email(), customerDto.password());
    }

    @GetMapping("/id/{id}")
    public ResponseEntity<CustomerDto> getOne(@PathVariable int id){
        final var customer=customerService.getById(id);
        if (customer.isEmpty()){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
        //final var customerDto=convertEntityToDto(customer.get());
        return ResponseEntity.status(HttpStatus.OK).body(convertEntityToDto(customer.get()));
    }

//    @GetMapping()
//    public ResponseEntity<List<CustomerDto>> getAll(){
//        final var list=customerService.getAll();
//        List <CustomerDto> customerDtoList=new ArrayList<>();
//        if (list.isEmpty()){
//            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
//        }
//        for (Customer customer:list){
//            customerDtoList.add(convertEntityToDto(customer));
//        }
//        return ResponseEntity.status(HttpStatus.OK).body(customerDtoList);
//    }

    @GetMapping("/email/{email}")
    public ResponseEntity<CustomerDto> getEmail(@PathVariable String email){
        final var entity=customerService.getByEmail(email);
        return ResponseEntity.status(HttpStatus.OK).body(convertEntityToDto(entity));
    }

    @PostMapping("/save")
    public ResponseEntity<CustomerDto> createCustomer(@RequestBody CustomerDto customerDto) {
        final var customer=customerService.getByIdOrEmail(customerDto.id(), customerDto.email());
        if (customer.isPresent()){
            return ResponseEntity.status(HttpStatus.CONFLICT).build();
        }
        final var customerEntity = customerService.createCustomer(convertDtoToEntity(customerDto));
        return ResponseEntity.status(HttpStatus.OK).body(convertEntityToDto(customerEntity));
    }

    @PostMapping()
    public ResponseEntity<CustomerDto> login(@RequestBody LoginDto loginDto){
        final var entity=customerService.getByEmailAndPassword(loginDto.email(),loginDto.password());
        if (entity.isEmpty()){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }
        return ResponseEntity.status(HttpStatus.OK).body(convertEntityToDto(entity.get()));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<CustomerDto> deleteCustomer(@PathVariable int id){
        final var customer1=customerService.getById(id);
        if (customer1.isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
        final var customer=customerService.delete(id);
        return  ResponseEntity.status(HttpStatus.OK).body(convertEntityToDto(customer));
    }

    @PutMapping("/{id}")
    public ResponseEntity<CustomerDto> updateCustomer(@PathVariable int id,@RequestBody CustomerDto customerDto){
        final var customer1=customerService.getById(id);
        if (customer1.isEmpty()){
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }

        final var customerEntity = customerService.createCustomer(convertDtoToEntity(customerDto));
        return ResponseEntity.status(HttpStatus.OK).body(convertEntityToDto(customerEntity));
    }
}
