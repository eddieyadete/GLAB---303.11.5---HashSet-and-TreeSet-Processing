package com.hashSet.java;

import java.util.HashSet;

public class ExampleThreeHash {

    public void exampleThreeHash() {
        HashSet<Integer> primeNum = new HashSet<>();
//        HashSet<Integer> primeNumbers = new HashSet<>();
        primeNum.add(2);
        primeNum.add(3);
        primeNum.add(5);
        System.out.println("HashSet1: " + primeNum);

        HashSet<Integer> oddNum = new HashSet<>();
        oddNum.add(1);
        oddNum.add(3);
        oddNum.add(5);
        System.out.println("HashSet2: " + oddNum);

        // Difference between HashSet1 and HashSet2

        primeNum.removeAll(oddNum);
        System.out.println("Difference : " + primeNum);


    }
}
