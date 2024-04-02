package com.util.maps;

import java.util.*;

public class MapStateDemo {
    public static void main(String[] args) {
        Map<String, List<String>> stateMap = new HashMap<>();
        stateMap.put("Karnataka", Arrays.asList("Bengaluru","Chikkaballapura","Shivmoga"));
        stateMap.put("Andhra Pradesh", Arrays.asList("Madanapalli","Anantapur","Kadapa"));
        stateMap.put("Gujarat", Arrays.asList("Ahmedabad","Patan","Surat"));

        System.out.println(stateMap);
        System.out.println();

        System.out.println("State and Cities");
        Set<String> stateEntries1 = stateMap.keySet();
        for (String entry : stateEntries1){
            System.out.println(entry+" : "+stateMap.get(entry));
        }
        System.out.println();
        System.out.println("State and Cities");
        Set<Map.Entry<String, List<String>>> stateEntries = stateMap.entrySet();
        for (Map.Entry<String, List<String>> entry : stateEntries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }
}
