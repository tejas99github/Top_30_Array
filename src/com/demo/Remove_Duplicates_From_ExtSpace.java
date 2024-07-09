package com.demo;

import java.util.Scanner;

public class Remove_Duplicates_From_ExtSpace {

	public static int[] removeDuplicates(int[] array) {

		// Calculate the length of the new array (number of unique elements)
		int uniqueCount = 0;
		for (int i = 0; i < array.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				uniqueCount++;
			}
		}

		// Create a new array to store unique elements
		int[] uniqueArray = new int[uniqueCount];
		int currentIndex = 0;

		// Copy unique elements to the new array
		for (int i = 0; i < array.length; i++) {
			boolean isDuplicate = false;
			for (int j = 0; j < i; j++) {
				if (array[i] == array[j]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				uniqueArray[currentIndex++] = array[i];
			}
		}
		return uniqueArray;
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

		int[] uniqueArray = removeDuplicates(array);

		// Print the array without duplicates
		System.out.println("Array without duplicates:");
		for (int i = 0; i < uniqueArray.length; i++) {
			System.out.print(uniqueArray[i] + " ");
		}

		scanner.close();
	}

}

/*
 * Consider an example array: int[] array = {1, 2, 3, 4, 2, 3, 5, 6, 1};
 * 
 * Initialization:
 * 
 * uniqueCount is initially set to 0. Outer Loop (i):
 * 
 * When i = 0, the current element is 1. The inner loop checks if 1 is a
 * duplicate of any previous elements (there are none). So, isDuplicate remains
 * false. uniqueCount is incremented to 1. Second Iteration of Outer Loop (i):
 * 
 * When i = 1, the current element is 2. The inner loop checks if 2 is a
 * duplicate of any previous elements (there are none). So, isDuplicate remains
 * false. uniqueCount is incremented to 2. Third Iteration of Outer Loop (i):
 * 
 * When i = 2, the current element is 3. The inner loop checks if 3 is a
 * duplicate of any previous elements (there are none). So, isDuplicate remains
 * false. uniqueCount is incremented to 3. Fourth Iteration of Outer Loop (i):
 * 
 * When i = 3, the current element is 4. The inner loop checks if 4 is a
 * duplicate of any previous elements (there are none). So, isDuplicate remains
 * false. uniqueCount is incremented to 4. Fifth Iteration of Outer Loop (i):
 * 
 * When i = 4, the current element is 2. The inner loop checks if 2 is a
 * duplicate of any previous elements (1). It finds a duplicate, so isDuplicate
 * becomes true. uniqueCount remains 4. Sixth Iteration of Outer Loop (i):
 * 
 * When i = 5, the current element is 3. The inner loop checks if 3 is a
 * duplicate of any previous elements (1, 2). It finds a duplicate, so
 * isDuplicate becomes true. uniqueCount remains 4. Seventh Iteration of Outer
 * Loop (i):
 * 
 * When i = 6, the current element is 5. The inner loop checks if 5 is a
 * duplicate of any previous elements (1, 2, 3, 4). There are no duplicates, so
 * isDuplicate remains false. uniqueCount is incremented to 5. Eighth Iteration
 * of Outer Loop (i):
 * 
 * When i = 7, the current element is 6. The inner loop checks if 6 is a
 * duplicate of any previous elements (1, 2, 3, 4, 5). There are no duplicates,
 * so isDuplicate remains false. uniqueCount is incremented to 6. Ninth
 * Iteration of Outer Loop (i):
 * 
 * When i = 8, the loop finishes. After the outer loop completes, uniqueCount
 * will contain the total count of unique elements in the array, which is 6 in
 * this example.
 * 
 * Array Initialization:
 * 
 * uniqueArray is initialized as an array of integers with a size equal to
 * uniqueCount, which is 6 in our example. currentIndex is initialized to 0.
 * This variable will be used to keep track of the index where the next unique
 * element should be inserted into uniqueArray.
 * 
 * Copying Unique Elements:
 * 
 * The loop iterates through each element of the input array array.
 * 
 * for each element at index i, it checks if it's a duplicate by comparing it
 * with all the elements before it (from index 0 to i - 1).
 * 
 * If a duplicate is found(i.e., if array[i] == array[j] for any j less than i),
 * isDuplicate is set to true, and the inner loop breaks.
 * 
 * If isDuplicate is false, it means the current element at index i is unique.
 * 
 * In that case, the current unique element (array[i]) is copied to the
 * uniqueArray at the index currentIndex, and then currentIndex is incremented
 * to prepare for the next unique element.
 */