package com.userapp.exception;

public class NameExistsException extends Exception {
    public NameExistsException() {

    }

    public NameExistsException(String message) {
        super(message);
    }
}
