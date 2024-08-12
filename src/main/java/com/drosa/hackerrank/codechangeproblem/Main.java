package com.drosa.hackerrank.codechangeproblem;

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
     * Complete the 'getWays' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. LONG_INTEGER_ARRAY c
     */

    static boolean testPath(int n, List<Long> path) {
        return path.stream().mapToLong(Long::longValue).sum() <= n;
    }


    public static List<Long> generatePath(List<Long> c, int index, int n){
        return Collections.emptyList();
    }
    //entre 1 y 50 tipos de moneda
    //valor maximo de cada moneda es 50
    //valor de n maximo es 250
    public static long getWays(int n, List<Long> c) {
        // Write your code here
        List<Long> sortedCoins = c.stream().sorted(Comparator.reverseOrder()).collect(toList());

        int m = sortedCoins.size();

        for (int i = 0; i < m; i++) {
            List<Long> generatePaths = generatePath(c,i,n); //genera el path para c[i] en adelante
        }

        return 0;
    }

}

public class Main {
    public static void main(String[] args) throws IOException {
       /* BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int m = Integer.parseInt(firstMultipleInput[1]);

        List<Long> c = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Long::parseLong)
                .collect(toList());*/

        // Print the number of ways of making change for 'n' units using coins having the values given by 'c'

        int n = 10;
        List<Long> c = List.of(1L, 2L, 3L);
        long ways = Result.getWays(n, c);

    }
}

