package com.util.list;

import java.util.ArrayList;
import java.util.List;

public class CheckDemo {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Sridhar");
        names.add("Harsha");
        names.add("Chida");
        names.add("Likhith");
        names.add("Amogha");
        names.add("Sriram");
        names.add("Siddesh");

        List<String> nameStartsWithS = new ArrayList<>();

        for(String name : names){
            if(name.startsWith("S")){
                nameStartsWithS.add(name);
            }
        }

        for (String nameWithS : nameStartsWithS){
            System.out.println(nameWithS);
        }
    }
}
