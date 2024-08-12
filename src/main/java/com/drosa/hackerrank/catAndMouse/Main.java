package com.drosa.hackerrank.catAndMouse;

import java.util.List;

import static java.lang.Math.abs;

public class Main {

    // Complete the catAndMouse function below.
    static String catAndMouse(int x, int y, int z) {
        int xzDiff = abs(z-x);
        int yzDiff = abs(z-y);

        if (xzDiff<yzDiff) return "Cat A";
        if (xzDiff>yzDiff) return "Cat B";
        return "Mouse C";
    }


    public static void test() {
        //gradingStudents(List.of(51,50, 10, 15, 20, 25,30,35,44,51, 73, 67, 38, 33, 84, 29, 57)).forEach(System.out::println);
        //System.out.println(birthdayCakeCandles(List.of(3, 2, 1, 3)));
    }

    public static void main(String[] args) {
        test();
    }
}
