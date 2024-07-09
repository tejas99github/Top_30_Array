package com.demo;

//Find the Minimum element in a Sorted and Rotated Array using "binary search"

public class Find_MinEle_RotatedSort_Array {
	public static int findMin(int[] nums) {
		int left = 0;
		int right = nums.length - 1;

		while (left < right) {
			int mid = left + (right - left) / 2;

			// If mid element is greater than the last element, search in the right half
			if (nums[mid] > nums[right]) {
				left = mid + 1;
			} else { // Otherwise, search in the left half including mid
				right = mid;
			}
		}
		// At the end, left will be pointing to the minimum element
		return nums[left];
	}

	public static void main(String[] args) {
		int[] rotatedSortedArray = { 4, 5, 6, 7, 0, 1, 2 };
		System.out.println("Minimum element in the rotated sorted array: " + findMin(rotatedSortedArray));
	}
}

/*
 * This program uses binary search to find the minimum element. It compares the
 * middle element with the last element. If the middle element is greater, it
 * means the minimum is in the right half, otherwise, it is in the left half. It
 * narrows down the search space in each iteration until it finds the minimum
 * element.
 */