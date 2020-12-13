package com.darshan.set;

import java.util.SortedSet;
import java.util.TreeSet;

public class TreeSetConcept {
    public static void main(String[] args) {
        // Creating a TreeSet
        SortedSet<String> fruits = new TreeSet<>();

        // Adding new elements to a TreeSet
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");
        fruits.add("Orange");

        System.out.println("Fruits Set : " + fruits);

        // Duplicate elements are ignored
        fruits.add("Apple");
        System.out.println("After adding duplicate element \"Apple\" : " + fruits);

        // This will be allowed because it's in lowercase.
        fruits.add("banana");

        //sorting based on capital and then lowercase
        System.out.println("After adding \"banana\" : " + fruits);
    }
}
