package com.demo;

import java.util.Scanner;

//find all pairs in an array of integers whose sum is equal to a given integer.

public class Sum_Equalto_Pairsof_No {

	// finding pairs
	static void findSumPair(int ar[], int sum) {
		int low = 0;
		int high = ar.length - 1;

		while (low < high) {
			if (ar[low] + ar[high] > sum) {
				high--;
			} else if (ar[low] + ar[high] < sum) {
				low++;

			} else if (ar[low] + ar[high] == sum) {
				System.out.println("\nPair (" + ar[low] + " , " + ar[high] + ")");
				low++;
				high--;
			}
		}
	}

	// bubble sort for sorting
	static int[] sortArray(int ar[]) {
		for (int i = 0; i < ar.length; i++) {
			for (int j = 0; j < ar.length; j++) {
				if (ar[i] < ar[j]) {
					int temp = ar[i];
					ar[i] = ar[j];
					ar[j] = temp;
				}
			}
		}
		return ar;
	}

	public static void main(String[] args) {

		Scanner obj = new Scanner(System.in);
		System.out.println("Enter size of array : ");
		int size = obj.nextInt();

		int ar[] = new int[size];

		System.out.println("Add element into array : ");
		for (int i = 0; i < size; i++) {
			ar[i] = obj.nextInt();
		}

		System.out.println("Enter sum of number to find pair : ");
		int sum = obj.nextInt();

		System.out.println("Sorted array : ");
		int[] sortArray = sortArray(ar);
		for (int i = 0; i < sortArray.length; i++) {
			System.out.print(ar[i] + " ");
		}

		findSumPair(ar, sum);

		obj.close();
	}

}
