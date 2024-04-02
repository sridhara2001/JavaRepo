package com.util.set;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashDemo {
    public static void main(String[] args) {
//        Set<String> hashSet = new HashSet<>();
//        Set<String> hashSet = new LinkedHashSet<>();
        Set<String> hashSet = new TreeSet<>();
        hashSet.add("Apple");
        hashSet.add("Pineapple");
        hashSet.add("Orange");
        hashSet.add("Banana");
        hashSet.add("Kiwi");
        hashSet.add("100");
//        hashSet.add(null);
//        hashSet.add("Apple"); // duplicate not allowed
        System.out.println(hashSet);
        for (String element:hashSet){
            System.out.println(element);
        }
    }
}
