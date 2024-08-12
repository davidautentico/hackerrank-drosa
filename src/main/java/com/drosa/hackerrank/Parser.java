package com.drosa.hackerrank;

public class Parser {
    static String isBalanced(String s) {

        System.out.println(s.length() % 2);
        if (s.length() % 2 == 1) return "false";

        System.out.println("entrado");
        int openPar = 0;
        int openBrack = 0;
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if (charAt == '(') {
                openPar++;
            } else if (charAt == '{') {
                openBrack++;
            } else if (charAt == ')') {
                openPar--;
                if (openPar < 0) return "false";
                if (i>0 && s.charAt(i-1)=='{') return "false";
            } else if (charAt == '}') {
                openBrack--;
                if (openBrack < 0) return "false";
                if (i>0 && s.charAt(i-1)=='(') return "false";
            }

        }

        System.out.println(openBrack + " " + openPar);
        if (openBrack != 0 || openPar != 0) return "false";
        return "true";
    }

    public static void main(String[] args) {
        System.out.println(isBalanced("{}()"));
        System.out.println(isBalanced("({()})"));
        System.out.println(isBalanced("{})"));
    }
}
