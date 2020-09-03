package com.innovative.algo.sorting;

import com.innovative.algo.domain.SortingOrder;

import java.util.Arrays;

public class BubbleSort implements Sorting {

    /**
     * Complexity of O(n**2)
     *
     * @param entry random input array
     * @return sorted array
     */
    public static void sortInput(int[] entry, SortingOrder sortingOrder) {
        sort(sortingOrder, entry);
    }

    /**
     * Complexity of O(n**2)
     *
     * @param entry random input array
     * @return sorted array
     */
    public static int[] sort(int[] entry, SortingOrder sortingOrder) {

        int[] entry2 = Arrays.copyOf(entry, entry.length);
        sort(sortingOrder, entry2);
        return entry2;
    }

    private static void sort(SortingOrder sortingOrder, int[] entry2) {
        for (int i = 0; i < entry2.length; i++) {
            for (int j = 0; j < entry2.length - 1; j++) {
                if (!isTupleSorted(entry2[j], entry2[j + 1], sortingOrder)) {
                    swapTuple(entry2, j);
                }
            }
        }
    }

    private static void swapTuple(int[] entry, int j) {
        int temporary = entry[j];
        entry[j] = entry[j+1];
        entry[j+1] = temporary;
    }

    /*
        Return true if the numbers are sorted, default sort is Asc.
     */
    private static Boolean isTupleSorted(int firstNumber, int secondNumber, SortingOrder sortingOrder) {
        if (SortingOrder.ASC.equals(sortingOrder)) {
            return firstNumber <= secondNumber;
        }
        if (SortingOrder.DESC.equals(sortingOrder)) {
            return firstNumber >= secondNumber;
        }
        return firstNumber <= secondNumber;
    }
}
