package com.drosa.hackerrank.reducedString;

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
     * Complete the 'superReducedString' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String superReducedString(String s) {
        StringBuilder reducedString = new StringBuilder(s);

        int i = 0;
        while (i < reducedString.length()) {
            if (i + 1 < reducedString.length()
                    && reducedString.charAt(i + 1) == reducedString.charAt(i)) {
                char char1 = reducedString.charAt(i + 1);
                char char0 = reducedString.charAt(i);
                reducedString.deleteCharAt(i + 1);
                reducedString.deleteCharAt(i);
                i = Math.max((i - 1), 0);

                System.out.println("removed: " + char0 + " " + char1 + " new i:" + i);

            } else {
                i++;
            }
        }

        return reducedString.length() == 0 ? "Empty String" : reducedString.toString();
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        // BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        // BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = "aaabccddd";

        String result = Result.superReducedString(s);

        System.out.println(result);
    }
}
