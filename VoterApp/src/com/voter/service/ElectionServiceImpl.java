package com.voter.service;

import com.voter.exception.InvalidVoterIDException;
import com.voter.exception.LocalityNotFoundException;
import com.voter.exception.NotEligibleException;
import com.voter.exception.UnderAgeException;

public class ElectionServiceImpl implements IElectionService {
    @Override
    public boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException {
        if(age<18){
            throw new UnderAgeException("Your age is not eligible due to age");
        }else if(!locality.equalsIgnoreCase("Bengaluru")){
            throw new LocalityNotFoundException("Your age is not eligible due to locality");
        }else if (vid<20){
            throw new InvalidVoterIDException("Invalid ID");
        }else {
            return true;
        }
    }
}
