package com.learning.ds.searching;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
	public static void main(String[] args) {
		LinearSearch ls = new LinearSearch();
		System.out.println("**********LINEAR SEARCH**********");
		System.out.println("Enter number of element");
		Scanner scan = new Scanner(System.in);
		int numberOfElements = scan.nextInt();
		int [] arr = new int[numberOfElements];
		boolean isSortedArray = true;
		
		System.out.println("Enter number "+numberOfElements+" element with space");
		for(int i=0; i< numberOfElements; i++) {
			arr[i] = scan.nextInt();
			if(i > 0) { 
				isSortedArray = arr[i] > arr[i-1];
			}
		}
		
		System.out.println("Enter the element which you want to search!!!");
		int elementToBeScan = scan.nextInt();
		
		ls.printArray(arr);
		if(!isSortedArray) {
			System.out.println("Array Elements given not sorted in order");
			System.out.println("Hence!! Array will be sorted by System Default..");
			Arrays.sort(arr);
			ls.printArray(arr);
		}
		
		int indexOfElement = -1;
		
		for(int i = 0; i < numberOfElements; i++) {
			if(arr[i] == elementToBeScan) {
				indexOfElement = i+1;
				break;
			}
		}
		if(indexOfElement == -1) {
			System.out.println("The Searched element "+ elementToBeScan+" is not found in the Array");
		}else {
			System.out.println("The element "+elementToBeScan+" is found in the position "+ indexOfElement);
		}
		scan.close();
		
	}
	
	public void printArray (int [] arrayValue) {
		System.out.println("Array Values now !!!");
		for(int value: arrayValue) {
			System.out.print(value+" ");
		}
		System.out.println();
	}
}
