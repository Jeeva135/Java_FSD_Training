package in.stackroute.ust.movie.customer.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public record CustomerDto(int id,
        @NotNull(message = "Name cannot be null")
        @NotEmpty(message = "name cannot be empty")
        String name,
        @NotNull(message = "email cannot be null")
        @NotEmpty(message = "email cannot be empty")
        @Email(message = "Please provide a valid email") String email,
        @NotNull(message = "Password cannot be null")
        @NotEmpty(message = "Password cannot be empty") String password) {

}
