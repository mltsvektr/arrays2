package ru.maltseva.arrays2.util;

import java.util.Arrays;

public class ArraySorter {
    public static void sortArray(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            for (int k = 0; k < i; k++) {
                if (arr[k] > arr[k + 1]) {
                    int temp = arr[k + 1];
                    arr[k + 1] = arr[k];
                    arr[k] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
