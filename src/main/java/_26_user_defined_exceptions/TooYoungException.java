package _26_user_defined_exceptions;

// Custom exception class to represent "Too Young" condition
// Extends RuntimeException → this is an unchecked exception
public class TooYoungException extends RuntimeException {

    // Constructor that accepts a custom error message
    TooYoungException(String message) {

        // Call to parent class constructor (RuntimeException)
        // This passes the message to the exception handling mechanism
        super(message);
    }
}
