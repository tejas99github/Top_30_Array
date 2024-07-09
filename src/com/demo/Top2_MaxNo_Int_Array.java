package com.demo;

public class Top2_MaxNo_Int_Array {

	public static void main(String[] args) {

		int[] array = { 13, 10, 20, 15, 16, 18 };

		findTwoMax(array);
	}

	public static void findTwoMax(int[] array) {

		int max1 = array[0]; // 13 | 20
		int max2 = array[1]; // 10 | 13 | 15 | 16 | 18

		if (max1 < max2) {
			int temp = max1;
			max1 = max2;
			max2 = temp;
		}

		for (int i = 2; i < array.length; i++) {// 2<6, 3<6, 4<6, 5<6
			if (array[i] > max1) {// 20>13 ,
				max2 = max1; // max2=>13
				max1 = array[i]; // max1=>20
			} else if (array[i] > max2) { // 15>13, 16>15, 18>16
				max2 = array[i]; // max2=> 15, 16, 18
			}
		}

		System.out.println("First maximum number: " + max1);
		System.out.println("Second maximum number: " + max2);
	}
}
