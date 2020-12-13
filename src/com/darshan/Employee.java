package com.darshan;

/**
 * @author Darshan Patel
 */
public class Employee implements Comparable<Employee> { //we can compare only Employee type with this type

    public String name;
    public int age = 23; //default values
    public String dept = "DefaultDept"; //default values
    public String id;

    public Employee(String name) {
        this.name = name;
    }

    public Employee(String name, int id) {
        this.name = name;
        this.id = String.valueOf(id);
    }

    public Employee(String name, int age, String dept) {
        this.name = name;
        this.age = age;
        this.dept = dept;
    }

    @Override
    public boolean equals(Object obj) {

        if ((obj != null) && obj instanceof Employee) {
            String id = ((Employee) obj).id;
            if (id != null & this.id.equals(id)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        return this.id.hashCode();
    }


    @Override
    public String toString() {
        return "Employee{" + "name=" + name + ", age=" + age + ", dept=" + dept + '}';
    }

    @Override
    public int compareTo(Employee o) {   //retunr -1,0,1 depending on criteria
        if (this.age > o.age) {
            return 1;
        } else if (this.age < o.age) return -1;
        return 0;
    }

}