package in.stackroute.ust.movie.customer.service;

import in.stackroute.ust.movie.customer.domain.Customer;
import org.springframework.http.ResponseEntity;

import java.util.List;
import java.util.Optional;

public interface CustomerService {
    Optional<Customer> getById(int id);

    List<Customer> getAll();

    Customer createCustomer(Customer customer);

    Customer delete(int id);

    Customer getByEmail(String email);

    Optional<Customer> getByIdOrEmail(int id, String email);

    Optional<Customer> getByEmailAndPassword(String email, String password);
}
