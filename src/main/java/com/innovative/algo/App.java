package com.innovative.algo;



import com.innovative.algo.domain.SortingOrder;
import com.innovative.algo.sorting.BubbleSort;

import java.util.stream.IntStream;

public class App {

    public static void main(String[] args) {
        int[] entry = {6, 2, 4, 7, 1, 2, 3};
        printArray(entry);
        int[] result = BubbleSort.sort(entry, SortingOrder.ASC);
        printArray(entry);
        printArray(result);
    }

    private static void printArray(int[] entry) {
        IntStream.of(entry).forEach(System.out::print);
        System.out.println();
    }
}
