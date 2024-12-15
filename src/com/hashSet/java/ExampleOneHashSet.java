package com.hashSet.java;

import java.util.HashSet;

public class ExampleOneHashSet {

    public void exampleOne(){
        HashSet<Integer> evenNumber = new HashSet<>();
        // Using add() method
        evenNumber.add(2);
        evenNumber.add(4);
        evenNumber.add(6);
        System.out.println("HashSet: " + evenNumber);

        HashSet<Integer> numbers = new HashSet<>();
        //using addAll() method
        numbers.addAll(evenNumber);
        numbers.add(5);
        System.out.println("New HashSet: " + numbers);

//        List<Integer> evenNum = new ArrayList<>();
//        for(int num: numbers){
//            if(num%2==0){evenNum.add(num);}
//        }
//        System.out.println("New HashSet even: " + evenNum);


    }
}
