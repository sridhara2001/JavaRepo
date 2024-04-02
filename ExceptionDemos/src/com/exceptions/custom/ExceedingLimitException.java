package com.exceptions.custom;

public class ExceedingLimitException extends Exception {
    public ExceedingLimitException() {

    }

    public ExceedingLimitException(String message) {
        super(message);
    }
}
