package com.demo;

import java.util.HashSet;

public class First_Repetating_Element {
	public static int findFirstRepeating(int[] arr) {
		
		HashSet<Integer> set = new HashSet<>();

		int firstRepeating = -1;
		for (int i = arr.length - 1; i >= 0; i--) {
			if (set.contains(arr[i])) {
				firstRepeating = arr[i];
			} else {
				set.add(arr[i]);
			}
		}

		return firstRepeating;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 5, 3, 4, 3, 5, 6 };
		int firstRepeating = findFirstRepeating(arr);

		if (firstRepeating != -1) {
			System.out.println("The first repeating element is: " + firstRepeating);
		} else {
			System.out.println("No repeating element found.");
		}
	}
}
