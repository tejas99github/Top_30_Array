package com.demo;

//a java program to implement in place quick sort algorithm in Java.

public class Quick_Sort {

	public static void quickSort(int[] arr, int low, int high) {
		if (low < high) {
			// pividx is a partitioning index.
			int pividx = partition(arr, low, high);
			// Separately sort elements before partition
			quickSort(arr, low, pividx - 1);
			// Separately Sort elements after partition
			quickSort(arr, pividx + 1, high);
		}
	}

	/*
	 * This function takes last element as pivot places the pivot element at its
	 * correct position in sorted array, and places all smaller to left of pivot and
	 * all greater elements to right of pivot
	 */
	public static int partition(int arr[], int low, int high) {
		// Choosing the pivot
		int pivot = arr[high];

		// Index of smaller element & indicates the right position of pivot found so far
		int i = low - 1;

		for (int j = low; j < high; j++) {
			// If current element is smaller than storeIndexthe pivot
			if (arr[j] < pivot) {
				// Increment index of smaller element
				i++;
				// swapping original ele at ith positon to found samller ele than pivot
				swap(arr, i, j);
			}
		}
		i++;
		// swapping of pivot to its appropriate position
		swap(arr, i, high);
		// return pivot index
		return i;

	}

	// A utility function to swap two elements
	static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {

		int[] arr = { 6, 3, 9, 5, 2, 8 };

		// Function call
		quickSort(arr, 0, arr.length - 1);

		// To print sorted array
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
