package com.demo;

import java.util.ArrayList;
import java.util.List;

//How to find common elements in three sorted array?

public class CommonEle_3Sorted_Array {

	public static List<Integer> findCommonElements(int[] arr1, int[] arr2, int[] arr3) {
		int i = 0, j = 0, k = 0;
		List<Integer> commonElements = new ArrayList<>();
//		0,0,0 | 1,0,0 |1,0,1 | 1,0,2 | 2,1,3 | 3,1,3 | 3,1,4 | 4,2,5
		while (i < arr1.length && j < arr2.length && k < arr3.length) {

			if (arr1[i] == arr2[j] && arr2[j] == arr3[k]) {// 1,0,2 =>10, 3,1,4 =>20
				commonElements.add(arr1[i]);
				i++;
				j++;
				k++;
			} else if (arr1[i] < arr2[j]) {
				i++;
			} else if (arr2[j] < arr3[k]) {
				j++;
			} else {
				k++;
			}
		}

		return commonElements;
	}

	public static void main(String[] args) {
		int[] arr1 = { 5, 10, 15, 20 };
		int[] arr2 = { 10, 20, 30, 40 };
		int[] arr3 = { 1, 5, 10, 15, 20 };

		List<Integer> commonElements = findCommonElements(arr1, arr2, arr3);

		System.out.println("Common elements: " + commonElements);
	}

}
