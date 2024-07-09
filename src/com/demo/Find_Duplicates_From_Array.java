package com.demo;

import java.util.Arrays;
import java.util.Scanner;

public class Find_Duplicates_From_Array {

	public static int[] findDuplicates(int[] array) {
		// Create a temporary array to store duplicate elements
		int[] duplicateArray = new int[array.length];
		int duplicateCount = 0;

		// Check for duplicates
		for (int i = 0; i < array.length; i++) {
			for (int j = i + 1; j < array.length; j++) {
				if (array[i] == array[j]) {
					// If a duplicate is found, store it in the duplicate array
					duplicateArray[duplicateCount++] = array[i];
					break; // Break to avoid counting the same duplicate multiple times
				}
			}
		}

		// Trim the duplicate array to remove unused spaces
		return Arrays.copyOf(duplicateArray, duplicateCount);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the length of the array:");
		int length = scanner.nextInt();

		int[] array = new int[length];

		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < length; i++) {
			array[i] = scanner.nextInt();
		}

		int[] duplicateArray = findDuplicates(array);

		// Print the array with only duplicates
		System.out.println("Duplicates in the array:");
		for (int i = 0; i < duplicateArray.length; i++) {
			System.out.print(duplicateArray[i] + " ");
		}
		scanner.close();
	}

}
