package com.innovative.algo.sorting;

import com.innovative.algo.domain.SortingOrder;
import com.innovative.algo.sorting.quadratic.InsertSort;
import org.junit.Test;

import java.util.Arrays;

import static com.innovative.algo.Utils.assertOrdered;
import static com.innovative.algo.Utils.printArray;
import static org.junit.Assert.*;

public class InsertSortTest {

    private InsertSort insertSort = new InsertSort();

    @Test
    public void sortAsc() {
        int[] entry = {6, 2, 4, 7, 1, 2, 3};
        printArray(entry);

        int[] result = insertSort.sort(entry, SortingOrder.ASC);

        printArray(entry);
        printArray(result);

        assertNotEquals(entry,result);
        assertOrdered(result, SortingOrder.ASC);
    }

    @Test
    public void sortDesc() {
        int[] entry = {6, 2, 4, 7, 1, 2, 3};
        printArray(entry);

        int[] result = insertSort.sort(entry, SortingOrder.DESC);

        printArray(entry);
        printArray(result);

        assertNotEquals(entry,result);
        assertEquals("7643221", Arrays.toString(result).replaceAll("[^\\d.]", ""));
        assertEquals("6247123", Arrays.toString(entry).replaceAll("[^\\d.]", ""));
        assertOrdered(result, SortingOrder.DESC);
    }

    @Test
    public void sortAsctOnInputVariable() {
        int[] entry = {6, 2, 4, 7, 1, 2, 3};
        insertSort.sortInput(entry, SortingOrder.DESC);
        assertEquals("7643221", Arrays.toString(entry).replaceAll("[^\\d.]", ""));
        assertOrdered(entry, SortingOrder.DESC);
    }
}