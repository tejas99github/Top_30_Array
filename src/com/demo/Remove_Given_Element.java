package com.demo;

//How to remove a given element from array in Java?

public class Remove_Given_Element {

	public static void main(String[] args) {

		int[] array = { 1, 2, 3, 4, 5 };

		int elementToRemove = 3;

		// Find the index of the element to remove
		int indexToRemove = -1; // 2

		for (int i = 0; i < array.length; i++) {// 0<5,1<5, 2<5,
			if (array[i] == elementToRemove) {// 1!=3, 2!=3, 3==3
				indexToRemove = i; // 2
				break;
			}
		}

		if (indexToRemove != -1) {

			// Shift elements to fill the gap
			for (int i = indexToRemove; i < array.length - 1; i++) { // 2<4,3<4
				array[i] = array[i + 1]; // ar[2]=4, ar[3]=5
			}

			// Create a new array with reduced size
			int[] newArray = new int[array.length - 1]; // size=4

			// Copy elements to the new array
			for (int i = 0; i < newArray.length; i++) {
				newArray[i] = array[i];
			}

			// Assign the new array to the original array
			array = newArray;

			// Print the modified array
			System.out.println("Array after removal:");
			for (int num : array) {
				System.out.print(num + " ");
			}
		} else {
			System.out.println("Element not found in the array.");
		}
	}
}
