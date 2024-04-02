package com.voter.exception;

public class LocalityNotFoundException extends NotEligibleException{
    public LocalityNotFoundException() {
    }

    public LocalityNotFoundException(String message) {
        super(message);
    }
}
