package com.voter.exception;

public class NotEligibleException extends Exception {
    public NotEligibleException() {

    }

    public NotEligibleException(String message) {
        super(message);
    }
}
