package com.demo;

public class Merge_Sorted_Array {

	public static void main(String[] args) {
		int[] arr1 = { 1, 3, 5, 7 };
		int[] arr2 = { 2, 4, 6, 8, 9 };

		int[] mergedArray = mergeArrays(arr1, arr2);

		System.out.println("Merged array:");
		for (int num : mergedArray) {
			System.out.print(num + " ");
		}
	}

	public static int[] mergeArrays(int[] arr1, int[] arr2) {
		int n1 = arr1.length;
		int n2 = arr2.length;

		// Resultant merged array
		int[] mergedArray = new int[n1 + n2];

		int i = 0;
		int j = 0;
		int k = 0;

		// Traverse both arrays
		while (i < n1 && j < n2) {

			if (arr1[i] < arr2[j]) {
				mergedArray[k++] = arr1[i++];
			} else {
				mergedArray[k++] = arr2[j++];
			}
		}

		// Copy remaining elements of arr1, if any
		while (i < n1) {
			mergedArray[k++] = arr1[i++];
		}

		// Copy remaining elements of arr2, if any
		while (j < n2) {
			mergedArray[k++] = arr2[j++];
		}

		return mergedArray;
	}
}
