package com.demo;

import java.util.Scanner;

public class Find_Min_Max_Unsorted_Array {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		// Prompt the user to enter the size of the array
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		// Create an array of the specified size
		int[] arr = new int[size];

		// Prompt the user to enter array elements
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			System.out.print("Element " + (i + 1) + ": ");
			arr[i] = scanner.nextInt();
		}

		// Find the largest and smallest numbers
		int max = arr[0];
		int min = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}
			if (arr[i] < min) {
				min = arr[i];
			}
		}

		// Print the largest and smallest numbers
		System.out.println("Largest number: " + max);
		System.out.println("Smallest number: " + min);

		scanner.close();
	}
}
