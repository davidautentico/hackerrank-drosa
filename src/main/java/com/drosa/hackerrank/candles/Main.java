package com.drosa.hackerrank.candles;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static int birthdayCakeCandles(List<Integer> candles) {
        // Write your code here
        int maxHeight = 0;
        int total = 0;

        for (int candle : candles) {
            if (candle > maxHeight) {
                maxHeight = candle;
                total = 1;
            } else if (candle == maxHeight) total++;
        }
        return total;
    }


    public static void test() {
        //gradingStudents(List.of(51,50, 10, 15, 20, 25,30,35,44,51, 73, 67, 38, 33, 84, 29, 57)).forEach(System.out::println);
        System.out.println(birthdayCakeCandles(List.of(3, 2, 1, 3)));
    }

    public static void main(String[] args) {
        test();
    }
}
