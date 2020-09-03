package com.innovative.algo.sorting;

import com.innovative.algo.domain.SortingOrder;
import com.innovative.algo.sorting.logarithmic.MergeSort;
import org.junit.Test;

import java.util.Arrays;

import static com.innovative.algo.Utils.assertOrdered;
import static com.innovative.algo.Utils.printArray;
import static org.junit.Assert.*;

public class MergeSortTest {

    private MergeSort mergeSort = new MergeSort();

    @Test
    public void sortInput() {
        int[] entry = {6, 2, 4, 7, 1, 2, 3, 1};
        printArray(entry);

        int[] result = mergeSort.sort(entry, SortingOrder.ASC);

        printArray(entry);
        printArray(result);

        assertNotEquals(entry,result);
        assertEquals("11223467", Arrays.toString(result).replaceAll("[^\\d.]", ""));
        assertEquals("62471231", Arrays.toString(entry).replaceAll("[^\\d.]", ""));
        assertOrdered(result, SortingOrder.ASC);
    }

    @Test
    public void sortAsctOnInputOdd() {
        int[] entry = {6, 2, 4, 7, 1, 2, 3, 1, 4};
        printArray(entry);

        int[] result = mergeSort.sort(entry, SortingOrder.ASC);

        printArray(entry);
        printArray(result);

        assertNotEquals(entry,result);
        assertEquals("112234467", Arrays.toString(result).replaceAll("[^\\d.]", ""));
        assertEquals("624712314", Arrays.toString(entry).replaceAll("[^\\d.]", ""));
        assertOrdered(result, SortingOrder.ASC);
    }

    @Test
    public void sortInputDesc() {
        int[] entry = {6, 2, 4, 7, 1, 2, 3, 1};
        printArray(entry);

        int[] result = mergeSort.sort(entry, SortingOrder.DESC);

        printArray(entry);
        printArray(result);

        assertNotEquals(entry,result);
        assertEquals("76432211", Arrays.toString(result).replaceAll("[^\\d.]", ""));
        assertEquals("62471231", Arrays.toString(entry).replaceAll("[^\\d.]", ""));
        assertOrdered(result, SortingOrder.DESC);
    }

    @Test
    public void sortAsctOnInputOddDesc() {
        int[] entry = {6, 2, 4, 7, 1, 2, 3, 1, 4};
        printArray(entry);

        int[] result = mergeSort.sort(entry, SortingOrder.DESC);

        printArray(entry);
        printArray(result);

        assertNotEquals(entry,result);
        assertEquals("764432211", Arrays.toString(result).replaceAll("[^\\d.]", ""));
        assertEquals("624712314", Arrays.toString(entry).replaceAll("[^\\d.]", ""));
        assertOrdered(result, SortingOrder.DESC);
    }
}