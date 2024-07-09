package com.demo;

//How to find if there is a sub array with sum equal to zero?

public class SubArray_With_ZeroSum {

	public static boolean subArrayExists(int arr[], int n) {// {-3,2,3,1,6}
		for (int i = 0; i < n; i++) { // 0<5,1<5,2<5,3<5, 4<5,5<5
			int sum = arr[i]; // sum = arr[0]=-3, a[1]=2, a[2]=3, a[3]=1, a[4]=6
			/*
			 * It checks if the sum is equal to zero. If it is, it returns true immediately
			 * because a subarray with a sum of zero has been found.
			 */
			if (sum == 0) {
				return true;
			}
			/*
			 * It checks if the new sum is equal to zero. If it is, it means a subarray
			 * starting from index i and ending at index j (inclusive) has a sum of zero, so
			 * it returns true.
			 */
			for (int j = i + 1; j < n; j++) { // j=> 1<5, 2<5, 3<5, 4<5, 5<5
				sum = sum + arr[j]; // sum = -3+2=-1, -1+3=2, 2+1=3, 3+6=9
				if (sum == 0)
					return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int arr[] = { -3, 2, 3, 1, 6 };
//		int arr[] = { 4, 2, -3, 1, 6 };
		int N = arr.length;

		// Function call
		if (subArrayExists(arr, N))
			System.out.println("Found a subarray with 0 sum");
		else
			System.out.println("No Such Sub Array Exists!");

	}
}

/*
 * input: {4, 2, -3, 1, 6} Output: true Explanation: There is a subarray with
 * zero sum from index 1 to 3.
 * 
 * Input: {4, 2, 0, 1, 6} Output: true Explanation: The third element is zero. A
 * single element is also a sub-array.
 * 
 * Input: {-3, 2, 3, 1, 6} Output: false
 */

/*
 * A subarray is a contiguous part of array. An array that is inside another
 * array. For example, consider the array [1, 2, 3, 4], There are 10 non-empty
 * sub-arrays. The subarrays are (1), (2), (3), (4), (1,2), (2,3), (3,4),
 * (1,2,3), (2,3,4) and (1,2,3,4). In general, for an array/string of size n,
 * there are n*(n+1)/2 non-empty subarrays/substrings.
 */