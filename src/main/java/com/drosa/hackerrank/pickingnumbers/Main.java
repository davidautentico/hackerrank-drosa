package com.drosa.hackerrank.pickingnumbers;

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
     * Complete the 'pickingNumbers' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY a as parameter.
     */

    public static int pickingNumbers(List<Integer> a) {
        int maxSequence = 0;
        for (int i = 0; i < a.size(); i++) {
            int actualMin = a.get(i);
            int actualMax = a.get(i);
            int actualSequence = 1;
            System.out.println("** Initi seq pos " + i + " value= " + a.get(i));
            for (int j = 0; j < a.size(); j++) {
                if (j != i) {
                    int value = a.get(j);
                    if (value >= actualMin && value <= actualMax) {
                        actualSequence++;
                        System.out.println("Added case 1 between value:" + value);
                    } else if (value < actualMin && Math.abs(value - actualMax) <= 1) {
                        actualMin = value;
                        actualSequence++;
                        System.out.println("Added case 2 min value:" + value);
                    } else if (value > actualMax && Math.abs(value - actualMin) <= 1) {
                        actualMax = value;
                        actualSequence++;
                        System.out.println("Added case 3 max value:" + value);
                    }
                }
            }
            if (actualSequence > maxSequence) maxSequence = actualSequence;
        }

        return maxSequence;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {

        int result = Result.pickingNumbers(List.of(4, 6, 5, 3, 3, 1));
        System.out.println("result: " + result);
    }
}
