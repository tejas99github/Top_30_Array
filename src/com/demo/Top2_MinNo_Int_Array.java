package com.demo;

public class Top2_MinNo_Int_Array {

	public static void main(String[] args) {

		int[] array = { 13, 10, 20, 15, 16, 18 };

		findTwoMin(array);
	}

	public static void findTwoMin(int[] array) {

		int min1 = array[0];
		int min2 = array[1];

		if (min1 > min2) {
			int temp = min1;
			min1 = min2;
			min2 = temp;
		}

		for (int i = 2; i < array.length; i++) {
			if (array[i] < min1) {
				min2 = min1;
				min1 = array[i];
			} else if (array[i] < min2) {
				min2 = array[i];
			}
		}

		System.out.println("First minimum number: " + min1);
		System.out.println("Second minimum number: " + min2);
	}
}
