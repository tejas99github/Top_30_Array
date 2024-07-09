package com.demo;

public class Find_MaxSum_SubArray {

	public static int maxSubArraySum(int[] nums, int left, int right) {
		if (left == right) {
			return nums[left];
		}

		int mid = left + (right - left) / 2;

		// Maximum subarray sum in the left half
		int maxLeftSum = maxSubArraySum(nums, left, mid);

		// Maximum subarray sum in the right half
		int maxRightSum = maxSubArraySum(nums, mid + 1, right);

		// Maximum subarray sum crossing the midpoint
		int maxCrossingSum = maxCrossingSum(nums, left, mid, right);

		// Return the maximum of the three sums
		return Math.max(Math.max(maxLeftSum, maxRightSum), maxCrossingSum);
	}

	public static int maxCrossingSum(int[] nums, int left, int mid, int right) {
		int leftSum = 0; // Alteration here
		int sum = 0;

		// Calculate the maximum sum in the left half of the array
		for (int i = mid; i >= left; i--) {
			sum += nums[i];
			if (sum > leftSum) {
				leftSum = sum;
			}
		}

		int rightSum = 0; 
		sum = 0;

		// Calculate the maximum sum in the right half of the array
		for (int i = mid + 1; i <= right; i++) {
			sum += nums[i];
			if (sum > rightSum) {
				rightSum = sum;
			}
		}

		// Return the sum of maximum left and right sums
		return leftSum + rightSum;
	}

	public static void main(String[] args) {
		int[] nums = { -2, -3, 4, -1, -2, 1, 5, -3 };
		int maxSum = maxSubArraySum(nums, 0, nums.length - 1);
		System.out.println("Maximum sum of contiguous subarray: " + maxSum);
	}
}
