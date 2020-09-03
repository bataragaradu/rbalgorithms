package com.innovative.algo;

import com.innovative.algo.domain.SortingOrder;
import com.innovative.algo.sorting.BubbleSort;
import org.junit.Test;


import java.util.Arrays;

import static com.innovative.algo.Utils.printArray;
import static org.junit.Assert.*;

public class BubbleSortTest {

    @Test
    public void sortAsc() {
        int[] entry = {6, 2, 4, 7, 1, 2, 3};
        printArray(entry);

        int[] result = BubbleSort.sort(entry, SortingOrder.ASC);

        printArray(entry);
        printArray(result);

        assertNotEquals(entry,result);
        assertOrdered(result, SortingOrder.ASC);
    }

    @Test
    public void sortDesc() {
        int[] entry = {6, 2, 4, 7, 1, 2, 3};
        printArray(entry);

        int[] result = BubbleSort.sort(entry, SortingOrder.DESC);

        printArray(entry);
        printArray(result);

        assertNotEquals(entry,result);
        assertEquals("7643221", Arrays.toString(result).replaceAll("[^\\d.]", ""));
        assertEquals("6247123", Arrays.toString(entry).replaceAll("[^\\d.]", ""));
        assertOrdered(result, SortingOrder.DESC);
    }

    @Test
    public void sorAsctOnInputVariable() {
        int[] entry = {6, 2, 4, 7, 1, 2, 3};
        BubbleSort.sortInput(entry, SortingOrder.DESC);
        assertEquals("7643221", Arrays.toString(entry).replaceAll("[^\\d.]", ""));
        assertOrdered(entry, SortingOrder.DESC);
    }

    @Test
    public void sortDescOnInputVariable() {
        int[] entry = {6, 2, 4, 7, 1, 2, 3};
        BubbleSort.sortInput(entry, SortingOrder.DESC);
        assertEquals("7643221", Arrays.toString(entry).replaceAll("[^\\d.]", ""));
        assertOrdered(entry, SortingOrder.DESC);
    }

    private void assertOrdered(int[] entry, SortingOrder sortingOrder) {
        for(int i =0 ; i< entry.length-1; i++){
            if(SortingOrder.ASC.equals(sortingOrder)){
                assertTrue(entry[i]<=entry[i+1]);
            } else{
                assertTrue(entry[i]>=entry[i+1]);
            }
        }
    }

}