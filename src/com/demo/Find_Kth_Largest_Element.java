package com.demo;

public class Find_Kth_Largest_Element {

	public static int quickSelect(int[] arr, int low, int high, int k) {
		if (low <= high) {
			int n = arr.length;
			int kthLargestIndex = n - k;
			int pivotIdx = partition(arr, low, high);
			if (pivotIdx == kthLargestIndex) {
				return arr[pivotIdx];
			} else if (pivotIdx < kthLargestIndex) {
				return quickSelect(arr, pivotIdx + 1, high, k);
			} else {
				return quickSelect(arr, low, pivotIdx - 1, k);
			}
		}
		return -1; // Return -1 for invalid input or if k is out of bounds
	}

	public static int partition(int[] arr, int low, int high) {
		int pivot = arr[high];
		int i = low - 1;
		for (int j = low; j < high; j++) {
			if (arr[j] < pivot) {
				i++;
				swap(arr, i, j);
			}
		}
		i++;
		swap(arr, i, high);
		return i;
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

	public static void main(String[] args) {
		int[] arr = { 6, 3, 9, 5, 2, 8 };
		int k = 3; // Example: Finding the 3rd largest element
		int kthLargest = quickSelect(arr, 0, arr.length - 1, k);
		System.out.println("The " + k + "th largest element is: " + kthLargest);
	}
}
