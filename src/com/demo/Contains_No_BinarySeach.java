package com.demo;

import java.util.Scanner;
//How to check if array contains a number in Java

public class Contains_No_BinarySeach {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Input array size
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();
		int[] array = new int[size];

		// Input array elements
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			array[i] = scanner.nextInt();
		}

		// Input target number
		System.out.print("Enter the number to search for: ");
		int target = scanner.nextInt();

		// Sort the array
		bubbleSort(array);

		// Perform binary search
		boolean found = binarySearch(array, target);

		if (found) {
			System.out.println("Array contains the number " + target);
		} else {
			System.out.println("Array does not contain the number " + target);
		}

		scanner.close();
	}

	// Bubble sort
	public static void bubbleSort(int[] array) {
		int n = array.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					// Swap elements
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	// Binary search
	public static boolean binarySearch(int[] array, int target) {
		int left = 0;
		int right = array.length - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (array[mid] == target) {
				return true;
			} else if (array[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}

		return false;
	}
}
