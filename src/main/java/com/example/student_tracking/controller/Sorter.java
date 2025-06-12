package com.example.student_tracking.controller;

import java.util.Arrays;

public class Sorter {

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // takas
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        return arr;
    }

    public static int binarySearch(int[] arr, int key) {
        int left = 0, right = arr.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (arr[mid] == key) {
                return mid;
            }
            if (arr[mid] < key) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }

    public static void testSortAndSearch() {
        int[] dizi = {9, 4, 1, 7, 3};
        System.out.println("Sıralanmadan önce: " + Arrays.toString(dizi));
        bubbleSort(dizi);
        System.out.println("Sıralandı: " + Arrays.toString(dizi));
        int index = binarySearch(dizi, 4);
        System.out.println("4 sayısı dizideki yeri: " + index);
    }
}
