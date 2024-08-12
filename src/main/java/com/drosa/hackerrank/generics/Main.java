package com.drosa.hackerrank.generics;

import java.io.*;
import java.util.*;

public class Main {

    public static <E> void printArray(E[] elements){
        for(E element : elements)
            System.out.println(element);
    }

    public static void main(String[] args) {
        Integer[] intArr = {1,2,3};
        String [] strArr = {"Hello", "World"};
        printArray(intArr);
        printArray(strArr);
    }
}
