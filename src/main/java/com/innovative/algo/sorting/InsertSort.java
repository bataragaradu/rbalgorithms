package com.innovative.algo.sorting;

import com.innovative.algo.domain.SortingOrder;

import java.util.Arrays;

public class InsertSort extends Sorting {

    @Override
    int[] sort(int[] entry, SortingOrder sortingOrder) {
        int[] entry2 = Arrays.copyOf(entry, entry.length);
        sortInput(entry2, sortingOrder);
        return entry2;
    }

    @Override
    void sortInput(int[] entry, SortingOrder sortingOrder) {

        for (int currentInsertedElement = 0; currentInsertedElement < entry.length; currentInsertedElement++) {
            for (int reverseCounter = currentInsertedElement; reverseCounter > 0
                    && !isTupleSorted(entry[reverseCounter - 1], entry[reverseCounter], sortingOrder); reverseCounter--) {
                swapTuple(entry, reverseCounter - 1, reverseCounter);
            }
        }
    }
}
