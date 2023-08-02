package in.stackroute.ust.movie.customer.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public record LoginDto (
        @NotNull(message = "email cannot be null")
        @NotEmpty(message = "email cannot be empty")
        @Email(message = "please provide a valid email address")
        String email,
        @NotNull(message = "password cannot be null")
        @NotEmpty(message = "password cannot be empty")
        String password
    ){
}
