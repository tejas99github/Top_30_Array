package com.demo;

import java.util.Scanner;

/*find the unique number which is not repeated twice. 
For example if given array is {1, 1, 2, 2, 3, 4, 4, 5, 5} then your program should return 3.
*/
public class Unique_Element_Finder {

	public static int findUniqueElement(int[] nums) {
		// Loop through the array
		for (int i = 0; i < nums.length; i++) {
			int count = 0;

			// Count occurrences of nums[i]
			for (int j = 0; j < nums.length; j++) {
				if (nums[j] == nums[i]) {
					count++;
				}
			}

			// If count is 1, return the unique element
			if (count == 1) {
				return nums[i];
			}
		}

		// If no unique element found, return -1 or throw an exception
		throw new IllegalArgumentException("No unique element found in the array");
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Take input for the size of the array
		System.out.print("Enter the size of the array: ");
		int size = scanner.nextInt();

		// Take input for array elements
		int[] nums = new int[size];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < size; i++) {
			nums[i] = scanner.nextInt();
		}

		// Call the function to find the unique element
		try {
			int uniqueElement = findUniqueElement(nums);
			System.out.println("The unique element in the array is: " + uniqueElement);
		} catch (IllegalArgumentException e) {
			System.out.println(e.getMessage());
		}

		scanner.close();
	}
}
