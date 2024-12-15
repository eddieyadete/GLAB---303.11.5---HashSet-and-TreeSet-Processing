package com.treeSet.java;

import java.util.TreeSet;

public class TreeSetExampleThree {

    public void treeSetExampleThree() {
        TreeSet<Integer> numbers = new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        System.out.println("TreeSet: " + numbers);

        //Using the first()
        int first = numbers.first();
        System.out.println("Frist: " + first);

        //using the last()
        int last = numbers.last();
        System.out.println("Last: " + last);
    }
}
