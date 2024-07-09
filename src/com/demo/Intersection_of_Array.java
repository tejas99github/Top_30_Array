package com.demo;

public class Intersection_of_Array {
	public static void main(String[] args) {
		int[] arr1 = { 21, 34, 41, 22, 35 };
		int[] arr2 = { 61, 34, 45, 21, 11 };

		int[] intersection = findIntersection(arr1, arr2);

		System.out.print("Intersection of the two arrays: ");
		for (int num : intersection) {
			System.out.print(num + " ");
		}
	}

	/*
	 * System.arraycopy(array, 0, trimmedArray, 0, newSize);: This line uses
	 * System.arraycopy() to copy elements from the original array (array) to the
	 * trimmed array (trimmedArray). Here's what each parameter means:
	 * 
	 * array: The source array from which elements are copied.
	 * 
	 * 0: The starting index in the source array from which the copying begins (in
	 * this case, it starts from the beginning).
	 * 
	 * trimmedArray: The destination array where elements are copied.
	 * 
	 * 0: The starting index in the destination array where the copied elements will
	 * be placed (in this case, it starts from the beginning).
	 * 
	 * newSize: The number of elements to be copied from the source array to the
	 * destination array.
	 */

	public static int[] trimArray(int[] array, int newSize) {
		int[] trimmedArray = new int[newSize];
		System.arraycopy(array, 0, trimmedArray, 0, newSize);
		return trimmedArray;
	}

	public static int[] findIntersection(int[] arr1, int[] arr2) {
		int[] intersection = new int[Math.min(arr1.length, arr2.length)];
		int count = 0;

		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					intersection[count++] = arr1[i];
					break; // Break to avoid duplicate entries
				}
			}
		}

//		return Arrays.copyOf(intersection, count); //builtin function

		// Trim intersection array to remove any unused slots
		return trimArray(intersection, count);

	}
}
