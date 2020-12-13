package com.darshan.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListSortExample {
    public static void main(String[] args) {

        List<Integer> numbers = new ArrayList<>();
        numbers.add(13);
        numbers.add(7);
        numbers.add(18);
        numbers.add(5);
        numbers.add(2);

        System.out.println("Before : " + numbers);

        // Sorting an ArrayList using Collections.sort() method
        Collections.sort(numbers);

        System.out.println("After : " + numbers);


        List<String> names = new ArrayList<>();
        names.add("Lisa");
        names.add("Jennifer");
        names.add("Mark");
        names.add("David");

        System.out.println("Names : " + names);

        // Sort an ArrayList using its sort() method. You must pass a Comparator to the ArrayList.sort() method.
        names.sort(new Comparator<String>() {
            @Override
            public int compare(String name1, String name2) {
                return name1.compareTo(name2);
            }
        });
        // Dynamic sorting..

        // Compartor vs Comparable (Check ArrayListObjectSortExample)

        // The above `sort()` method call can also be written simply using lambda expression
        names.sort((name1, name2) -> name1.compareTo(name2));

        // Following is an even more concise solution
        names.sort(Comparator.naturalOrder());

        System.out.println("Sorted Names : " + names);
    }
}
