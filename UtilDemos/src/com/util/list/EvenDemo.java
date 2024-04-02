package com.util.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class EvenDemo {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(11,12,25,68,43,5,76);

        List<Integer> evenNums = new ArrayList<>();

        for(int num:nums){
            if(num%2==0){
                evenNums.add(num);
            }
        }

        for (int evenNum : evenNums){
            System.out.println(evenNum);
        }
    }
}
