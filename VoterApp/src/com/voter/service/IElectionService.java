package com.voter.service;

import com.voter.exception.InvalidVoterIDException;
import com.voter.exception.LocalityNotFoundException;
import com.voter.exception.NotEligibleException;
import com.voter.exception.UnderAgeException;

public interface IElectionService {
    boolean checkEligibility(int age, String locality, int vid) throws NotEligibleException;
}
