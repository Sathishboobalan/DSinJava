package com.learning.ds.sorting;

import java.util.Scanner;

public class SortingMain {

    private void intiateAlgorithm(int number, Scanner scan) {
        int[] arr;
        switch (number) {
            case 1:
                System.out.println("****** WELCOME TO BUBBLE SORTING ALGORITHM ******");
                BubbleSort bs = new BubbleSort();
                arr = getUserInput(scan);
                bs.initiate(arr);
                bs.print(arr, "BUBBLE SORT");
                break;
            case 2:
                System.out.println("****** WELCOME TO INSERTION SORTING ALGORITHM ******");
                InsertionSort is = new InsertionSort();
                arr = getUserInput(scan);
                is.initiate(arr);
                is.print(arr, "INSERTION SORT");
                break;
            case 3:
                System.out.println("****** WELCOME TO SELECTION SORTING ALGORITHM ******");
                SelectionSort ss = new SelectionSort();
                arr = getUserInput(scan);
                ss.initiate(arr);
                ss.print(arr, "SELECTION SORTING");
                break;
            default:
                break;
        }
    }

    public int[] getUserInput(Scanner scan) {
        System.out.println("Enter How Many Elements do you want to Insert!!");
        int n = scan.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter "+ n + " Elements of Array by Space");
        for(int i = 0; i < n; i++) {
            arr[i] = scan.nextInt();
        }
        return arr;
    }

    public static void main(String[] args) {
        System.out.println("****** WELCOME TO SORTING ******");

        SortingMain obj = new SortingMain();

        Scanner scan = new Scanner(System.in);

        boolean choosenValidAlgorithm = true;
        do {
            System.out.println("Choose the Algorithm which you want to use to Sort Array Elements");
            System.out.println("1. Bubble Sort");
            System.out.println("2. Insertion Sort");
            System.out.println("3. Selection Sort");
            int keyCodeOfAlgo = scan.nextInt();
            if (keyCodeOfAlgo > 0 && keyCodeOfAlgo <= 3) {
                obj.intiateAlgorithm(keyCodeOfAlgo, scan);
            }else {
                System.out.println("Invalid Input");
                choosenValidAlgorithm = false;
            }
        } while (!choosenValidAlgorithm);

        scan.close();
    }

}
