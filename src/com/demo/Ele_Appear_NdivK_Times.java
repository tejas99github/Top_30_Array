package com.demo;

//Given an array of of size n and a number k, find all elements that appear more than n/k times?

public class Ele_Appear_NdivK_Times {
	public static int[] findElements(int[] nums, int k) {
		if (nums == null || nums.length == 0 || k <= 0) {
			return new int[0];
		}

		// Find the maximum element in nums
		int maxNum = nums[0];
		for (int num : nums) {
			maxNum = Math.max(maxNum, num);
		}

		// Create an array to store frequencies of elements
		int[] frequencyArray = new int[maxNum + 1];
		// Iterate through the array and count frequencies
		for (int num : nums) {
			frequencyArray[num]++;
		}

		int threshold = nums.length / k;

		// Count the number of elements with frequency greater than threshold
		int count = 0;
		for (int i = 0; i < frequencyArray.length; i++) {
			if (frequencyArray[i] > threshold) {
				count++;
			}
		}

		// Create an array to store elements with frequency greater than threshold
		int[] result = new int[count];
		int index = 0;
		// Store elements with frequency greater than threshold in the result array
		for (int i = 0; i < frequencyArray.length; i++) {
			if (frequencyArray[i] > threshold) {
				result[index++] = i;
			}
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 3, 1, 2, 2, 1, 2, 3, 3 };
		int k = 4;
		int[] result = findElements(nums, k);
		System.out.print("Elements appearing more than n/k times: ");
		for (int num : result) {
			System.out.print(num + " ");
		}
	}
}
