package com.demo;

import java.util.Scanner;

//Program  to Find Missing Number on Integer Array of n to m in range
//input: array = {5, 3, 7, 8, 9} output missingarray={4, 6}
public class Find_Missing_Element {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		// Taking user input for array elements
		System.out.print("Enter the number of elements in the array: ");
		int length = scanner.nextInt();
		int[] array = new int[length];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < length; i++) {
			array[i] = scanner.nextInt();
		}

		// Find the lowest and highest elements within the range of the array
		int lowest = findLowestElement(array);
		int highest = findHighestElement(array);

		int[] missingElements = findMissingElements(array, lowest, highest);
		System.out.println("Missing elements in the range [" + lowest + ", " + highest + "]:");
		for (int element : missingElements) {
			System.out.print(element + " ");
		}

		scanner.close();
	}

	public static int findLowestElement(int[] array) {
		int lowest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] < lowest) {
				lowest = array[i];
			}
		}
		return lowest;
	}

	public static int findHighestElement(int[] array) {
		int highest = array[0];
		for (int i = 1; i < array.length; i++) {
			if (array[i] > highest) {
				highest = array[i];
			}
		}
		return highest;
	}

	public static int[] findMissingElements(int[] array, int lowest, int highest) {

		/*
		 * This presence array is used to track the presence of elements within the
		 * range defined by lowest and highest.(inclusive Missing element as size So,
		 * highest - lowest + 1 would be 9 - 3 + 1 = 7.)
		 */
		boolean[] presence = new boolean[highest - lowest + 1];

		/*
		 * For example, if we encounter the number 5, we'll mark presence[5 - 3] as
		 * true, which corresponds to presence[2].
		 * 
		 * presence = [true, false, true, false, true, true, true]
		 * 
		 */

		for (int num : array) {
			if (num >= lowest && num <= highest) {
				presence[num - lowest] = true;
			}
		}

		/*
		 * Checking Presence: Within the loop, we check if the element at the
		 * corresponding index in the presence array is false. If !presence[i - lowest]
		 * evaluates to true, it means that the number i (within the range [lowest,
		 * highest]) is missing because its presence is not marked in the presence
		 * array.
		 * 
		 * so here count = 2
		 */
		int count = 0;
		for (int i = lowest; i <= highest; i++) {
			if (!presence[i - lowest]) {
				count++;
			}
		}

		/*
		 * After counting the missing elements, an array missingElements is initialized
		 * with a size of count.
		 */
		int[] missingElements = new int[count];

		/*
		 * Another iteration is performed from lowest to highest. For each number i in
		 * this range, if its presence is not marked in the presence array (!presence[i
		 * - lowest]), it means it's a missing element, so it's added to the
		 * missingElements array, and the index is incremented.
		 */
		int index = 0;
		for (int i = lowest; i <= highest; i++) {
			if (!presence[i - lowest]) {
				missingElements[index++] = i;
			}
		}

		/*
		 * Finally, the array missingElements, containing all the missing elements
		 * within the specified range, is returned.
		 */
		return missingElements;
	}
}
