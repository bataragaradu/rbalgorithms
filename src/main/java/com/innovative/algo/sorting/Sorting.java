package com.innovative.algo.sorting;

import com.innovative.algo.domain.SortingOrder;

/*
    The implementatino classes can be service beans because they should be one time instanciated.
 */
public abstract class Sorting {

    public  abstract int[] sort(int[] entry, SortingOrder sortingOrder);

    public abstract void sortInput(int[] entry, SortingOrder sortingOrder);

    protected void swapTuple(int[] entry, int position1,int position2) {
        int temporary = entry[position1];
        entry[position1] = entry[position2];
        entry[position2] = temporary;
    }

    /*
        Return true if the numbers are sorted, default sort is Asc.
     */
    protected Boolean isTupleSorted(int firstNumber, int secondNumber, SortingOrder sortingOrder) {
        if (SortingOrder.ASC.equals(sortingOrder)) {
            return firstNumber <= secondNumber;
        }
        if (SortingOrder.DESC.equals(sortingOrder)) {
            return firstNumber >= secondNumber;
        }
        return firstNumber <= secondNumber;
    }
}
