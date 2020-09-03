package com.innovative.algo;

import com.innovative.algo.domain.SortingOrder;

import java.util.stream.IntStream;

import static org.junit.Assert.assertTrue;

public class Utils {

    public static void printArray(int[] entry) {
        IntStream.of(entry).forEach(System.out::print);
        System.out.println();
    }

    public static void assertOrdered(int[] entry, SortingOrder sortingOrder) {
        for(int i =0 ; i< entry.length-1; i++){
            if(SortingOrder.ASC.equals(sortingOrder)){
                assertTrue(entry[i]<=entry[i+1]);
            } else{
                assertTrue(entry[i]>=entry[i+1]);
            }
        }
    }
}
