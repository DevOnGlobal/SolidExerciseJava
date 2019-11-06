package nl.cynetic.solidexercises.services;

public class BusinessServiceException extends Exception {
    /**
     *
     */
    private static final long serialVersionUID = 1L;

    public BusinessServiceException(String message) {
        super(message);
    }
}