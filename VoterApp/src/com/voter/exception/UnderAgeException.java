package com.voter.exception;

public class UnderAgeException extends NotEligibleException{
    public UnderAgeException() {
    }

    public UnderAgeException(String message) {
        super(message);
    }
}
