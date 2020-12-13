package com.darshan.map;

import com.darshan.Employee;

import java.util.HashMap;
import java.util.Map;

public class HashMapConcept {

    public static void main(String[] args) {
        Map<String, String> userCityMapping = new HashMap<>();

        // Check if a HashMap is empty
        System.out.println("is userCityMapping empty? : " + userCityMapping.isEmpty());

        userCityMapping.put("John", "New York");
        userCityMapping.put("John", "San Frans.");
        userCityMapping.put("Rajeev", "Bengaluru");

        System.out.println(userCityMapping.get("John"));

        // Add a new key-value pair only if the key does not exist in the HashMap, or is mapped to `null`
        userCityMapping.putIfAbsent("Steve", "London");

        System.out.println("userCityMapping HashMap : " + userCityMapping);

        // Find the size of a HashMap
        System.out.println("We have the city information of " + userCityMapping.size() + " users");

        String userName = "Steve";
        // Check if a key exists in the HashMap
        if (userCityMapping.containsKey(userName)) {
            // Get the value assigned to a given key in the HashMap
            String city = userCityMapping.get(userName);
            System.out.println(userName + " lives in " + city);
        } else {
            System.out.println("City details not found for user " + userName);
        }

        // Check if a value exists in a HashMap
        if (userCityMapping.containsValue("New York")) {
            System.out.println("There is a user in the userCityMapping who lives in New York");
        } else {
            System.out.println("There is not user in the userCityMapping who lives in New York");
        }


        // Modify the value assigned to an existing key
        userCityMapping.put(userName, "California");
        System.out.println(userName + " moved to a new city " + userCityMapping.get(userName) + ", New userCityMapping : " + userCityMapping);

        // The get() method returns `null` if the specified key was not found in the HashMap
        System.out.println("Lisa's city : " + userCityMapping.get("Lisa"));

        Map<Employee, String> employeesMap = new HashMap<>();
        employeesMap.put(new Employee("Rajeev", 1), "A");
        employeesMap.put(new Employee("David", 2), "B");
        employeesMap.put(new Employee("Jack", 3), "C");

        //Try this without toString and equals method
        System.out.println(employeesMap.get(new Employee("David", 2)));

        //LinkedHashMap<Integer, String> customerIdNameMapping = new LinkedHashMap<>();
    }
}

