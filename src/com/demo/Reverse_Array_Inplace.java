package com.demo;

public class Reverse_Array_Inplace {
	public static void reverseArray(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {
			// Swap elements at start and end indices
			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;

			// Move towards the center
			start++;
			end--;
		}
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 };

		System.out.println("Original array:");
		for (int num : array) {
			System.out.print(num + " ");
		}

		reverseArray(array);

		System.out.println("\nReversed array:");
		for (int num : array) {
			System.out.print(num + " ");
		}
	}
}

/*
 * This code defines a reverseArray method that takes an integer array as input
 * and reverses its elements in place. The method uses two pointers, start and
 * end, starting from the beginning and end of the array respectively, and swaps
 * elements until they meet in the middle. Finally, the main method demonstrates
 * the usage of this method by reversing an array and printing both the original
 * and reversed arrays.
 */