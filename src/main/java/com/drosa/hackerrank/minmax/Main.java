package com.drosa.hackerrank.minmax;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
        // Write your code here
        long max = 0;
        long min= (int) Math.pow(10,10);
        for (int i = 0; i < 5; i++) {
            long actual = 0;
            for (int j = 0; j < 5; j++) {
                if (j != i) {
                    actual += arr.get(j);
                }
            }
            if (actual > max) {
                max = actual;
            }
            if (actual < min) {
                min = actual;
            }
        }

        System.out.println(min + " " + max);
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}

