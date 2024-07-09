package com.demo;

import java.util.Scanner;

public class Contains_No_LinearSearch {
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

		// Perform linear search
		boolean found = containsNumber(array, target);

		if (found) {
			System.out.println("Array contains the number " + target);
		} else {
			System.out.println("Array does not contain the number " + target);
		}

		scanner.close();
	}

	// Linear search
	public static boolean containsNumber(int[] array, int target) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == target) {
				return true;
			}
		}
		return false;
	}
}
