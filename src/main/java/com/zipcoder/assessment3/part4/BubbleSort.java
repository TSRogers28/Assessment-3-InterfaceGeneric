package com.zipcoder.assessment3.part4;

public class BubbleSort <T> {


    public static int[] sort(int[] numbers) {
        int temp;
        for (int i = 1; i < numbers.length ; i++) {
            for (int j = 0; j < numbers.length - 1; j++) {
                if (numbers[j] > numbers[i]) {
                    temp = numbers[j];
                    numbers[j] = numbers[i];
                    numbers[i] = temp;
                }
            }
        }
        return numbers;
    }
}
