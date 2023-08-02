package in.stackroute.ust.movie.customer.exception;

public class CustomerAlreadyExistsException extends RuntimeException{
    String uri;
    public CustomerAlreadyExistsException(String message) {
        super(message);
        this.uri=uri;
    }

    public String getUri() {
        return uri;
    }
}
