package com.innovative.algo.sorting.logarithmic;

import com.innovative.algo.sorting.SortingGeneric;

import java.util.Arrays;
import java.util.Comparator;

public class GenericMergeSort<T> extends SortingGeneric<T> {

    @Override
    public T[] sort(T[] entry, Comparator<? super T> comparator) {
        return sort2(entry, comparator);
    }


    private T[] sort2(T[] entry, Comparator<? super T> comparator) {
        if (entry.length <= 1) {
            return entry;
        }
        T[] firstHalf = Arrays.copyOfRange(entry, 0, entry.length / 2);
        T[] secondHalf = (T[]) Arrays.copyOfRange(entry, entry.length / 2, entry.length);
        firstHalf = sort2(firstHalf, comparator);
        secondHalf = sort2(secondHalf, comparator);
        return mergeSort(firstHalf, secondHalf, comparator);
    }

    private T[] mergeSort(T[] firstHalf, T[] secondHalf, Comparator<? super T> comparator) {
        T[] result = (T[]) new Object[firstHalf.length + secondHalf.length];
        int firstHalfCounter = 0;
        int secondHalfCounter = 0;
        int resultCounter = 0;

        while (firstHalfCounter != firstHalf.length && secondHalfCounter != secondHalf.length) {
            if (this.isTupleSorted(firstHalf[firstHalfCounter], secondHalf[secondHalfCounter], comparator)) {
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
