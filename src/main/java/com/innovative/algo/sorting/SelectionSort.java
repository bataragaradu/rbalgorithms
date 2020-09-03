package com.innovative.algo.sorting;

import com.innovative.algo.domain.SortingOrder;

import java.util.Arrays;

public class SelectionSort extends Sorting {

    @Override
    public int[] sort(int[] entry, SortingOrder sortingOrder) {
        int[] entry2 = Arrays.copyOf(entry, entry.length);
        sortInput(entry2, sortingOrder);
        return entry2;
    }

    @Override
    public void sortInput(int[] entry, SortingOrder sortingOrder) {
        for (int i = 0; i < entry.length; i++) {
            int itemToBeInserted = entry[i];
            int positionItemToBeInserted = i;
            for(int j=i; j<entry.length;j++){
                if(!isTupleSorted(itemToBeInserted, entry[j], sortingOrder)) {
                    itemToBeInserted = entry[j];
                    positionItemToBeInserted = j;
                }
            }
            this.swapTuple(entry, i, positionItemToBeInserted);
        }
    }
}
