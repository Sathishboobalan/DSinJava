package com.learning.ds.sorting;

public class SelectionSort extends PrintArray implements Sorting{

    @Override
    public int[] initiate(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            int index = i;
            for(int j = i+1; j < arr.length; j++) {
                if(arr[j] < arr[i]) {
                    i = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }
    
}
