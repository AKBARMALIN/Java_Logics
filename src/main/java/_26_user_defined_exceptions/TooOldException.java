package _26_user_defined_exceptions;

// Custom exception class
// This class extends RuntimeException → it is an unchecked exception
public class TooOldException extends RuntimeException {

    // Constructor that accepts a custom error message
    TooOldException(String message) {

        // Call parent class (RuntimeException) constructor
        // to pass the message to Exception handling mechanism
        super(message);
    }
}
