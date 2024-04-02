package com.userapp.client;

import com.userapp.exception.NameExistsException;
import com.userapp.exception.TooLongException;
import com.userapp.exception.TooShortException;
import com.userapp.service.IValidationService;
import com.userapp.service.ValidationServiceImpl;

import java.util.Scanner;

public class Registration {
    public static void main(String[] args) throws NameExistsException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your username");
        String username = sc.next();
        IValidationService validationService = new ValidationServiceImpl();
        try{
            if (validationService.validateUsername(username))
                System.out.println("Enter Password");
                String userpassword = sc.next();
                try{
                    if(validationService.validatePassword(userpassword))
                        System.out.println("welcome "+username);
                }catch (TooShortException | TooLongException e){
                    System.out.println(e.getMessage());
                }
        }catch(NameExistsException e){
            System.out.println(e.getMessage());
        }
    }
}
