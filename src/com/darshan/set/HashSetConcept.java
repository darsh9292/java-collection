package com.darshan.set;

import java.util.*;

public class HashSetConcept {

    public static void main(String[] args) {
        // Creating a HashSet
        Set<String> daysOfWeek = new HashSet<>(); // Internally HashMap

        // Adding new elements to the HashSet
        daysOfWeek.add("Monday");
        daysOfWeek.add("Tuesday");
        daysOfWeek.add("Wednesday");
        daysOfWeek.add("Thursday");
        daysOfWeek.add("Friday");
        daysOfWeek.add("Saturday");
        daysOfWeek.add("Sunday");

        // Adding duplicate elements will be ignored
        daysOfWeek.add("Monday");

        System.out.println(daysOfWeek);
        System.out.println("Is monday available : " + daysOfWeek.contains("Monday"));

        ///Generate unique list from other collection.

        List<Integer> numbersDivisibleBy5 = new ArrayList<>();
        numbersDivisibleBy5.add(5);
        numbersDivisibleBy5.add(10);
        numbersDivisibleBy5.add(15);
        numbersDivisibleBy5.add(20);
        numbersDivisibleBy5.add(25);

        List<Integer> numbersDivisibleBy3 = new ArrayList<>();
        numbersDivisibleBy3.add(3);
        numbersDivisibleBy3.add(6);
        numbersDivisibleBy3.add(9);
        numbersDivisibleBy3.add(12);
        numbersDivisibleBy3.add(15);

        // Creating a HashSet from another collection (ArrayList)
        Set<Integer> numbersDivisibleBy5Or3 = new HashSet<>(numbersDivisibleBy5);

        // Adding all the elements from an existing collection to a HashSet
        numbersDivisibleBy5Or3.addAll(numbersDivisibleBy3);

        System.out.println(numbersDivisibleBy5Or3);

        //same clear and remove(index) methods...

        // Same thing for sorting as list

        // Employee custom class value uniqness, same as HashMap Key.

        /**
         * The only difference between HashSet and LinkedHashSet is that:
         * LinkedHashSet maintains the insertion order.
         */

        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(6);
        hashSet.add(0);
        System.out.println("HashSet : "+hashSet); //Unpredictable

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(5);
        linkedHashSet.add(1);
        linkedHashSet.add(3);
        linkedHashSet.add(6);
        linkedHashSet.add(0);
        System.out.println("linkedHashSet : "+linkedHashSet); //ordered
    }
}
