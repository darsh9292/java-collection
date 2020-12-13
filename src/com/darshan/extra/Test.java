package com.darshan.extra;

import java.util.ArrayList;

public class Test {

    private int age;

    public Test(int age) {
        this.age = age;
    }

    public static void main(String[] args) {


        int i[] = new int[5];
        Integer j[] = new Integer[5];

//        i[6] = 6;

//        ArrayList<Integer> list = new ArrayList();

//        System.out.println(i[6]);

        Test test = new Test(5);
        Test test1 = new Test(5);

        System.out.println(test.equals(test1));
    }
}
