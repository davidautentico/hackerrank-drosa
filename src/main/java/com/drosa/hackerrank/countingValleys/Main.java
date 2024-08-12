package com.drosa.hackerrank.countingValleys;

import java.util.List;

public class Main {

    /*
     * Complete the 'countingValleys' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER steps
     *  2. STRING path
     */

    public static int countingValleys(int steps, String path) {
        // Write your code here
        int total = 0;
        int actualLevel = 0;
        for (int i = 0; i < path.length(); i++) {
            char move = path.charAt(i);
            if (move == 'D') {
                actualLevel--;
            } else {
                actualLevel++;
                if (actualLevel == 0) total++;
            }
        }

        return total;
    }


    public static void test() {
        //gradingStudents(List.of(51,50, 10, 15, 20, 25,30,35,44,51, 73, 67, 38, 33, 84, 29, 57)).forEach(System.out::println);
        //System.out.println(birthdayCakeCandles(List.of(3, 2, 1, 3)));
    }

    public static void main(String[] args) {
        test();
    }
}
