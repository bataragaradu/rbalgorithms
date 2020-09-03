package com.innovative.algo;

import java.util.stream.IntStream;

public class Utils {
    public static void printArray(int[] entry) {
        IntStream.of(entry).forEach(System.out::print);
        System.out.println();
    }
}
