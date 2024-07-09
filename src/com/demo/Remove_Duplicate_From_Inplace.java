package com.demo;

//How to remove duplicates from array in place?
/*in place, it means you cannot use additional array or buffer, but using couple of variables is fine*/

public class Remove_Duplicate_From_Inplace {
	public static void main(String[] args) {
		int[] array = { 1, 2, 3, 3, 4, 5, 5, 6, 7, 8, 8, 9 };

		int length = removeDuplicates(array);

		// Printing the array after removing duplicates
		for (int i = 0; i < length; i++) {
			System.out.print(array[i] + " ");
		}
		System.out.println();
	}

	public static int removeDuplicates(int[] array) {
		if (array.length == 0)
			return 0;

		int index = 1; // Index to track unique elements

		for (int i = 1; i < array.length; i++) {
			int j;
			// Check if the current element is a duplicate
			for (j = 0; j < index; j++) {
				if (array[i] == array[j]) {
					break;
				}
			}
			// If not a duplicate, move it to the next unique position
			if (j == index) {
				array[index] = array[i];
				index++;
			}
		}

		return index;
	}
}

/*
 * In this code:
 * 
 * We use an index variable to keep track of the next position where a unique
 * element should be placed in the array. We iterate over the array starting
 * from the second element. For each element, we check if it's a duplicate by
 * comparing it with elements before the current index. If it's not a duplicate,
 * we move it to the next unique position. We return the index, which represents
 * the length of the array with duplicates removed.
 */