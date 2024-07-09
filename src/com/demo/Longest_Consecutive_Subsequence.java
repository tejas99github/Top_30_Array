package com.demo;

import java.util.HashSet;

//Java program to find longest consecutive subsequence

class Longest_Consecutive_Subsequence {
	// Returns length of the longest
	// consecutive subsequence
	static int findLongestConseqSubseq(int arr[], int n) {
		HashSet<Integer> S = new HashSet<Integer>();
		int ans = 0;

		// Hash all the array elements
		for (int i = 0; i < n; ++i)
			S.add(arr[i]);

		// check each possible sequence from the start
		// then update optimal length
		for (int i = 0; i < n; ++i) {
			// if current element is the starting
			// element of a sequence
			if (!S.contains(arr[i] - 1)) {
				// Then check for next elements
				// in the sequence
				int j = arr[i];
				while (S.contains(j))
					j++;

				// update optimal length if this
				// length is more
				if (ans < j - arr[i])
					ans = j - arr[i];
			}
		}
		return ans;
	}

	// Driver Code
	public static void main(String args[]) {
		int arr[] = { 1, 9, 3, 10, 4, 20, 2 };
		int n = arr.length;
		System.out.println("Length of the Longest consecutive subsequence is " + findLongestConseqSubseq(arr, n));
	}
}

/*
 * Follow the steps below to solve the problem:
 * 
 * Create an empty hash. Insert all array elements to hash. Do the following for
 * every element arr[i] Check if this element is the starting point of a
 * subsequence. To check this, simply look for arr[i] – 1 in the hash, if not
 * found, then this is the first element of a subsequence. If this element is
 * the first element, then count the number of elements in the consecutive
 * starting with this element. Iterate from arr[i] + 1 till the last element
 * that can be found. If the count is more than the previous longest subsequence
 * found, then update this.
 */