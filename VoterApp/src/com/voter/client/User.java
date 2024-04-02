package com.voter.client;

import com.voter.exception.NotEligibleException;
import com.voter.service.ElectionServiceImpl;
import com.voter.service.IElectionService;

public class User {
    public static void main(String[] args) {
        IElectionService electionService = new ElectionServiceImpl();
        try {
            boolean result =electionService.checkEligibility(18,"Bengaluru",21);
            if(result){
                System.out.println("You are eligible");
            }else{
                System.out.println("You are not eligible");
            }
        } catch (NotEligibleException e) {
            e.printStackTrace();
        }
    }
}
