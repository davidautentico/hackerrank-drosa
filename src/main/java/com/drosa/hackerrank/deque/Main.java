package com.drosa.hackerrank.deque;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque<Integer> deque = new ArrayDeque<>();
        int n = in.nextInt();
        int m = in.nextInt();

        int maxUniques = 0;
        int actualUniques = 0;
        int[] freqArr = new int[1000000];
        for (int i = 0; i < 100000; i++) freqArr[i] = 0;

        for (int i = 1; i <= n; i++) {
            int num = in.nextInt();
            //add
            deque.addLast(num);
            freqArr[num - 1]++;
            if (freqArr[num - 1] == 1) {
                actualUniques++;
            }

            if (deque.size() == m) {
                if (actualUniques > maxUniques) {
                    maxUniques = actualUniques;
                }

                //remove
                int removed = deque.removeFirst();
                freqArr[removed - 1]--;
                if (freqArr[removed - 1] == 0) {
                    actualUniques--;
                }
            }

        }

        System.out.println(maxUniques);
    }
}
