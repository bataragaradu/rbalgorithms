package com.innovative.algo.sorting.logarithmic;

import com.innovative.algo.domain.Apartment;
import org.junit.Test;

import java.util.Comparator;
import java.util.stream.Stream;

import static org.junit.Assert.*;

public class GenericMergeSortTest {

    private GenericMergeSort<Apartment> genericMergeSort = new GenericMergeSort<>();

    @Test
    public void sort() {
        Apartment[] apartments = new Apartment[]{new Apartment(3), new Apartment(2), new Apartment(1),new Apartment(5)};
        Object[] result = genericMergeSort.sort(apartments, (Comparator.comparing(Apartment::getId)));
        Stream.of(result).forEach((System.out::print));
        for(int i =0 ; i< result.length-1; i++) {
            assertTrue(((Apartment) result[i]).getId().compareTo(((Apartment) result[i]).getId())<= 0);
        }
    }
}
