package com.demo;

//Program to rearrange array in alternating positive and negative number

public class Alternate_Posi_Negi {

	public static void main(String[] args) {

		// Provided input array
		int[] arr = { 1, 2, 3, -4, -1, 4 };

		// Array to store positive numbers
		int[] positiveNumbers = new int[arr.length]; // {1,2,3,4}

		// Array to store negative numbers
		int[] negativeNumbers = new int[arr.length]; // {-4,-1}

		// Count of positive and negative numbers
		int posCount = 0; // 4
		int negCount = 0; // 2

		// Separate positive and negative numbers
		for (int num : arr) {
			if (num >= 0)
				positiveNumbers[posCount++] = num;
			else
				negativeNumbers[negCount++] = num;
		}

		// Index for positive and negative numbers array
		int posIndex = 0; // 1,2,3,4,5
		int negIndex = 0; // 1,2,

		boolean insertPositive = false;

		// Fill original array with alternating negative and positive values
		for (int i = 0; i < arr.length; i++) { // 0,1,2,3,4,5,6 <= <6

			if (insertPositive) {
				if (posIndex < posCount) { // 0<4,1<4,4<5
					arr[i] = positiveNumbers[posIndex++]; // a[1]=1, a[3]=2, a[5]=4
				} else {
					arr[i] = negativeNumbers[negIndex++];
				}
			} else {
				if (negIndex < negCount) { // 0<2, 1<2, 2<2,
					arr[i] = negativeNumbers[negIndex++]; // a[0]=-4, a[2]= -1;
				} else {
					arr[i] = positiveNumbers[posIndex++]; // a[4]= 3,
				}
			}

			insertPositive = !insertPositive; // Alternate between positive and negative
		}

		// Print the modified array
		System.out.println("Modified array:");
		for (int num : arr) {
			System.out.print(num + " ");
		}
	}
}

/*
 * Given an array of positive and negative numbers, arrange them in an alternate
 * fashion such that every positive number is followed by negative and
 * vice-versa maintaining the order of appearance. Number of positive and
 * negative numbers need not be equal. If there are more positive numbers they
 * appear at the end of the array. If there are more negative numbers, they too
 * appear in the end of the array.
 */
