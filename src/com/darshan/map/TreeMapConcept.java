package com.darshan.map;

import java.util.Hashtable;
import java.util.Map;
import java.util.SortedMap;
import java.util.TreeMap;

public class TreeMapConcept {

    public static void main(String[] args) {

//        Map table = new Hashtable();

        // Creating a TreeMap
        Map<String, String> fileExtensions = new TreeMap<>();

        // Adding new key-value pairs to a TreeMap
        fileExtensions.put("python", ".py");
        fileExtensions.put("c++", ".cpp");
        fileExtensions.put("kotlin", ".kt");
        fileExtensions.put("golang", ".go");
        fileExtensions.put("java", ".java");

        // Printing the TreeMap (Output will be sorted based on keys)
        System.out.println(fileExtensions);
    }
}
