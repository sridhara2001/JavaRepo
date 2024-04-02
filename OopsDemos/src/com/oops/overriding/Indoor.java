package com.oops.overriding;

public class Indoor extends Sports {
    @Override
    String[] showTypes() {
        return new String[]{"Chess","Table Tennis","Carrom"};
    }
}
