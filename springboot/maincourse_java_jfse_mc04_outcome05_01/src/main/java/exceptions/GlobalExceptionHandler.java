package exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class GlobalExceptionHandler {
    @ExceptionHandler(BlogAlreadyExistsException.class)
    @ResponseStatus(HttpStatus.CONFLICT)
    public ResponseEntity<String> handleBlogAlreadyExists(BlogAlreadyExistsException blog){
        return ResponseEntity.status(HttpStatus.CONFLICT).body(blog.getMessage());
    }

    @ExceptionHandler(BlogNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ResponseEntity<String> handleBlogNotFound(BlogNotFoundException blog){
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(blog.getMessage());
    }
}
