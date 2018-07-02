package com.zipcoder.assessment3.part4;

import org.junit.Assert;
import org.junit.Test;

public class BubbleSortTest {

    @Test
    public void testSort_withMultipleNumbers(){
        int[] numbers = {9, 5, 2, 7, 3, 1};
        int[] actual = BubbleSort.sort(numbers);

        int[] expected = {1, 2, 3, 5, 7, 9};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort_withArrayEmpty(){
        int[] numbers = {};
        int[] actual = BubbleSort.sort(numbers);

        int[] expected = {};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort_withOneElement(){
        int[] numbers = {7};
        int[] actual = BubbleSort.sort(numbers);

        int[] expected = {7};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort_withTwoElementsInOrder(){
        int[] numbers = {7,9};
        int[] actual = BubbleSort.sort(numbers);

        int[] expected = {7,9};
        Assert.assertArrayEquals(expected, actual);
    }

    @Test
    public void testSort_withTwoElementsNotInOrder(){
        int[] numbers = {9, 7};
        int[] actual = BubbleSort.sort(numbers);

        int[] expected = {7, 9};
        Assert.assertArrayEquals(expected, actual);
    }

//    @Test
//    public void testSort_withArrayNull(){
//        Integer[] numbers = new Integer[10];
//        int[] actual = BubbleSort.sort(numbers);
//
//        int[] expected = {7, 9};
//        Assert.assertArrayEquals(expected, actual);
//    }




//1. When the array is null

  // add your tests here.
}
