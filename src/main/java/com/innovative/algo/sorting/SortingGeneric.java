package com.innovative.algo.sorting;

import com.innovative.algo.domain.SortingOrder;

import java.util.Comparator;

/*
    The implementatino classes can be service beans because they should be one time instanciated.
 */
public abstract class SortingGeneric<T> {

    public abstract T[] sort(T[] entry, Comparator<? super T> comparator);

//    public abstract void sortInput(T[] entry, Comparator<? super T> comparator);

    protected void swapTuple(T[] entry, int position1, int position2) {
        T temporary = entry[position1];
        entry[position1] = entry[position2];
        entry[position2] = temporary;
    }

    /*
        Return true if the numbers are sorted, default sort is Asc.
     */
    protected Boolean isTupleSorted(T firstNumber, T secondNumber, Comparator<? super T> comparator) {
        return comparator.compare(firstNumber, secondNumber) <= 0;
    }
}
