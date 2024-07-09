package com.demo;

public class Find_MaxProduct_SubArray {

	public static int maxProduct(int[] nums) {
		if (nums == null || nums.length == 0) {
			return 0;
		}

		int maxProduct = nums[0];
		int minProduct = nums[0];
		int result = nums[0];

		for (int i = 1; i < nums.length; i++) {
			int tempMax = Math.max(nums[i], Math.max(maxProduct * nums[i], minProduct * nums[i]));
			int tempMin = Math.min(nums[i], Math.min(maxProduct * nums[i], minProduct * nums[i]));

			maxProduct = tempMax;
			minProduct = tempMin;

			result = Math.max(result, maxProduct);
		}

		return result;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, -2, 4 };
		System.out.println("The largest product of a contiguous subarray is: " + maxProduct(nums));
	}
}
