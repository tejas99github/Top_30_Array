package com.demo;

public class Find_Kth_Smallest_Element {

	public static int quickSelect(int[] arr, int low, int high, int k) {
		if (low <= high) {
			int pivotIdx = partition(arr, low, high);
			if (pivotIdx == k) {
				/*
				 * The recursion continues until the base case is reached, where pivotIdx equals
				 * k, and the kth smallest element is found.
				 */
				return arr[pivotIdx];
			} else if (pivotIdx < k) {
				/*
				 * If the pivotIdx is less than k, it implies that the pivot element is placed
				 * before the kth smallest element. Hence, the kth smallest element must lie in
				 * the right partition of the array.
				 */
				return quickSelect(arr, pivotIdx + 1, high, k);
			} else {
				/*
				 * If the pivotIdx is greater than k, it implies that the pivot element is
				 * placed after the kth smallest element. Hence, the kth smallest element must
				 * lie in the left partition of the array.
				 */
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
		int k = 3;
		int kthSmallest = quickSelect(arr, 0, arr.length - 1, k - 1);
		System.out.println("The " + k + "th smallest element is: " + kthSmallest);
	}
}

/*
 * This is an optimization over Quick Sort Algorithm, In QuickSort, pick a pivot
 * element, then move the pivot element to its correct position and partition
 * the surrounding array. The idea is, not to do complete quicksort, but stop at
 * the point where pivot itself is k’th smallest element. Also, not to recur for
 * both left and right sides of pivot, but recur for one of them according to
 * the position of pivot.
 */
