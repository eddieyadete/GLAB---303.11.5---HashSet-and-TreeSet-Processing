package com.hashSet.java;

import java.util.HashSet;

public class ExampleFourHash {

    public void exampleFourHash() {
        //HashSet declaration
        HashSet<String> hset = new HashSet<>();

        //adding elements to the HashSet
        hset.add("Apple");
        hset.add("Banana");
        hset.add("Cherry");
        hset.add("Grape");
        hset.add("Fig");
        //adding of duplicate elements
        hset.add("Apple");
        hset.add("Banana");
        //addition of null values
        hset.add(null);
        hset.add(null);
        //Using advanced for loop
        for(String str : hset){
            System.out.println("-->" + str);
        }
    }
}
