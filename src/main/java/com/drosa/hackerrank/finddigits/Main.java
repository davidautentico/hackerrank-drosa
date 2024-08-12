package com.drosa.hackerrank.finddigits;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static com.drosa.hackerrank.finddigits.Result.findDigits;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int findDigits(int n) {
        char[] charArray = String.valueOf(n).toCharArray();
        IntStream intStreamDirect = new String(charArray).chars()
                .map(c -> c - '0');
        return (int) intStreamDirect.filter(digit -> n % digit == 0).count();
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println(findDigits(12));
    }
}

