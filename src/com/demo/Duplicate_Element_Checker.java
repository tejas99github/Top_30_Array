package com.demo;

import java.util.Arrays;

public class Duplicate_Element_Checker {
	public static boolean containsDuplicate(int[] nums) {
		// Sort the array
		Arrays.sort(nums);

		// Check adjacent elements for duplicates
		for (int i = 0; i < nums.length - 1; i++) {
			if (nums[i] == nums[i + 1]) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 4, 5 }; // Example array without duplicates
		int[] arrayWithDuplicates = { 1, 2, 3, 4, 1 }; // Example array with duplicates

		System.out.println("Array without duplicates:");
		System.out.println(Arrays.toString(array));
		System.out.println("Contains duplicates? " + containsDuplicate(array));

		System.out.println("\nArray with duplicates:");
		System.out.println(Arrays.toString(arrayWithDuplicates));
		System.out.println("Contains duplicates? " + containsDuplicate(arrayWithDuplicates));
	}
}
