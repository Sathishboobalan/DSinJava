package com.learning.ds.searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    
    public static void main(String[] args) {
		BinarySearch bs = new BinarySearch();
		System.out.println("**********BINARY SEARCH**********");
		System.out.println("Enter the number of Element in the Array");
		Scanner scan = new Scanner(System.in);
		int numberOfElements = scan.nextInt();
		int [] arr = new int[numberOfElements];
		boolean isSortedArray = true;
		
		System.out.println("Enter number "+ numberOfElements +" element with space");
		for(int i=0; i< numberOfElements; i++) {
			arr[i] = scan.nextInt();
			if(i > 0) { 
				isSortedArray = arr[i] > arr[i-1];
			}
		}
		
		System.out.println("Enter the element which you want to search!!!");
		int elementToBeScan = scan.nextInt();
		
		bs.printArray(arr);
		if(!isSortedArray) {
			System.out.println("Array Elements given not sorted in order");
			System.out.println("Hence!! Array will be sorted by System Default..");
			Arrays.sort(arr);
			bs.printArray(arr);
		}
		int indexOfElement = bs.binarySearch(0,numberOfElements-1, arr, elementToBeScan);
        if(indexOfElement == -1) {
			System.out.println("The Searched element "+ elementToBeScan+" is not found in the Array");
		}else {
			System.out.println("The element "+elementToBeScan+" is found in the position "+ indexOfElement);
		}
		scan.close();
		
	}
	
	private int binarySearch(int startIndex, int endIndex, int[] arr, int elementToBeScan) {
        if(startIndex <= endIndex) {
            int mid = startIndex+ (endIndex - startIndex) / 2;
            
            if(elementToBeScan == arr[mid]) { 
                return mid;
            }
            else if(elementToBeScan < arr[mid]) {
                return binarySearch(startIndex, mid-1, arr, elementToBeScan);
            }
            else if(elementToBeScan > arr[mid]) {
                return binarySearch(mid+1, endIndex, arr, elementToBeScan);
            }
        }
        return -1;
    }

    public void printArray (int [] arrayValue) {
		System.out.println("Array Values now !!!");
		for(int value: arrayValue) {
			System.out.print(value+" ");
		}
		System.out.println();
	}
}
