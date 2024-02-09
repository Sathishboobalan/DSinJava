package com.learning.ds.sorting;

public class BubbleSort extends PrintArray implements Sorting {

    @Override
    public int[] initiate(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                    swapped = true;
                }
                if (!swapped) {
                    break;
                }
            }
        }
        return arr;
    }

}
