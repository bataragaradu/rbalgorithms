package com.innovative.algo.sorting.logarithmic;

import com.innovative.algo.domain.SortingOrder;
import com.innovative.algo.sorting.Sorting;

import java.util.Arrays;

public class MergeSort extends Sorting {

    @Override
    public int[] sort(int[] entry, SortingOrder sortingOrder) {
        return sort2(entry, sortingOrder);
    }

    /*
        This will not work because the result is created in a deep copy because of the Arrays.copyOfRange. The entry arrays isn't manipulated.
        It's memory complexity is bigger, can be refined.
     */
    @Override
    public void sortInput(int[] entry, SortingOrder sortingOrder) {
        entry = Arrays.copyOf(sort2(entry, sortingOrder), entry.length);
    }

    private int[] sort2(int[] entry, SortingOrder sortingOrder) {
        if (entry.length <= 1) {
            return entry;
        }
        int[] firstHalf = Arrays.copyOfRange(entry, 0, entry.length / 2);
        int[] secondHalf = Arrays.copyOfRange(entry, entry.length / 2, entry.length);
        firstHalf = sort2(firstHalf, sortingOrder);
        secondHalf = sort2(secondHalf, sortingOrder);
        return mergeSort(firstHalf, secondHalf, sortingOrder);
    }

    private int[] mergeSort(int[] firstHalf, int[] secondHalf, SortingOrder sortingOrder) {
        int[] result = new int[firstHalf.length + secondHalf.length];
        int firstHalfCounter = 0;
        int secondHalfCounter = 0;
        int resultCounter = 0;

        while (firstHalfCounter != firstHalf.length && secondHalfCounter != secondHalf.length) {
            if (this.isTupleSorted(firstHalf[firstHalfCounter], secondHalf[secondHalfCounter], sortingOrder)) {
                result[resultCounter++] = firstHalf[firstHalfCounter++];
            } else {
                result[resultCounter++] = secondHalf[secondHalfCounter++];
            }
        }

        while (firstHalfCounter != firstHalf.length) {
            result[resultCounter++] = firstHalf[firstHalfCounter++];
        }
        while (secondHalfCounter != secondHalf.length) {
            result[resultCounter++] = secondHalf[secondHalfCounter++];
        }
        return result;
    }
}
