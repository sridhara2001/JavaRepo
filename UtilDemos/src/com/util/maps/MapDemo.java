package com.util.maps;

import java.util.*;

public class MapDemo {
    public static void main(String[] args) {
        Map<Integer, String> hashMap = new HashMap<>();
//        Map<Integer, String> hashMap = new LinkedHashMap<>();
//        Map<Integer, String> hashMap = new TreeMap<>();
        hashMap.put(1,"Java");
        hashMap.put(10,"Spring");
        hashMap.put(8,"Node");
        hashMap.put(null,"CSS");
        hashMap.put(null,"Angular");
        hashMap.put(5,"HTML");
        hashMap.put(1,"React");
        hashMap.put(100,null);
        hashMap.put(101,null);
        System.out.println(hashMap);

        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(102)); //null
        System.out.println(hashMap.getOrDefault(102,"JSP"));
        System.out.println(hashMap.containsKey(1));
        System.out.println(hashMap.values()); // to return the values

        System.out.println();
        Set<Integer> keys = hashMap.keySet();
        for (Integer key : keys){
            System.out.println(key+" : "+hashMap.get(key));
        }
        System.out.println();
        System.out.println("Another Method Using Entry Set");
        Set<Map.Entry<Integer, String>> entries = hashMap.entrySet();
        for (Map.Entry<Integer, String> entry : entries){
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }

    }
}
