package com.userapp.service;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;

public class ValidationServiceImpl implements IValidationService {


    @Override
    public boolean validatePassword(String password) throws TooShortException, TooLongException {
        if(password.length()<6){
            throw new TooShortException("Password is too short");
        }else if(password.length()>18){
            throw new TooLongException("Password is too long");
        }else {
            return true;
        }

    }

    @Override
    public boolean validateUsername(String username) throws NameExistsException {
        String[] usernames = {"Sri","Likhi","Amogh","Chida"};
        for (String userName:usernames){
            if (username.equalsIgnoreCase(userName)){
                throw new NameExistsException("Name already exists");
            }
        }
        return true;
    }
}
