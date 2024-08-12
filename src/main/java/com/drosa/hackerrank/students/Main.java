package com.drosa.hackerrank.students;

import java.util.List;
import java.util.stream.Collectors;

public class Main {

    private static int getNextMult(int n) {
        if (n % 5 == 0) return n;
        for (int i = 1; i <= 4; i++) {
            int mult = n + i;
            if (mult % 5 == 0) return (n + i);
        }
        return 0;
    }

    public static List<Integer> gradingStudents(List<Integer> grades) {
        // Write your code here
        return grades.stream().map(grade -> {
            if (grade < 38) return grade;
            int nextMult5 = getNextMult(grade);
            return (nextMult5 - grade) < 3 ? nextMult5 : grade;
        }).collect(Collectors.toList());

    }


    public static void test() {
        gradingStudents(List.of(51,50, 10, 15, 20, 25,30,35,44,51, 73, 67, 38, 33, 84, 29, 57)).forEach(System.out::println);
    }

    public static void main(String[] args) {
        test();
    }
}
