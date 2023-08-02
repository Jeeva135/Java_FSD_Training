package in.stackroute.ust.movie.customer.service;

import in.stackroute.ust.movie.customer.domain.Customer;
import in.stackroute.ust.movie.customer.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService{
    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public Optional<Customer> getById(int id) {
        return customerRepository.findById(id);
    }

    @Override
    public List<Customer> getAll() {
        return customerRepository.findAll();
    }

    @Override
    public Customer createCustomer(Customer customer) {
        return customerRepository.save(customer);
    }

    @Override
    public Customer delete(int id) {
        Customer customer=customerRepository.getById(id);
        customerRepository.deleteById(id);
        return customer;
    }

    @Override
    public Customer getByEmail(String email) {
        return customerRepository.findByEmail(email).get();
    }

    @Override
    public Optional<Customer> getByIdOrEmail(int id, String email) {
        return customerRepository.findByIdOrEmail(id,email);
    }

    @Override
    public Optional<Customer> getByEmailAndPassword(String email, String password) {
        return customerRepository.findByEmailAndPassword(email, password);
    }
}
