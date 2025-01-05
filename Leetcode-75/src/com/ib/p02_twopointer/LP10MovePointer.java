package com.ib.p02_twopointer;

import java.util.Arrays;

public class LP10MovePointer {

	public static void main(String[] args) {
		new Solution10().moveZeroes3(new int[] { 0, 1, 0, 3, 12 });

	}

}

class Solution10 {

	/*-Tip check out 2nd method cute isn't it...
	 *Approach:
	 * 	Aim is to put all the zero of given array to last
	 * 
	 *Two  Array Approach: 
	 *	initialize another array with same length;
	 *	loop input array use whenever non zero element put into new array into consecutive order
	 *	use a index pointer to maintain the order
	 *  new array elements were already zero you replaced all starting element with non zero
	 *  at last there will be already zero just make sure length is same
	 */
	public void moveZeroes3(int[] nums) {
		int[] arr2 = new int[nums.length];
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0) {
				arr2[index++] = nums[i];
			}
		}
		System.out.println(Arrays.toString(arr2));
	}

	/*-
	 * Approach:
	 * 	Aim is to put all the zero of given array to last
	 * 	Optimization : 
	 * 		we can use same array for the above operartion
	 * 		we can start second loop from index pointer to last length
	 * @param nums : integer array 
	 */
	public void moveZeroes(int[] nums) {
		int index = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != 0)
				nums[index++] = nums[i];
		}

		for (int i = index; i < nums.length; i++) {
			nums[i] = 0;
		}
		// System.out.println(Arrays.toString(nums));
	}

	/**
	 * Two pointer Approach
	 * stat both pointer at 0
	 * use right to go to next non zero element
	 * use left to point to last zero position just after a non zero element
	 * swap with left pointer when right pointer finds a non zero element
	 * @param nums
	 */
	public void moveZeroes0(int[] nums) {
		int left = 0;  // Initialize the left pointer
		int right = 0; // Initialize the right pointer
		// Move non-zero elements to the front
		while (right < nums.length) {
			if (nums[right] != 0) {
				int temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left++;  // Move left pointer only when a swap is made
			}
			right++;  // Always move the right pointer
		}

		System.out.println(Arrays.toString(nums));
	}

	/*-
	 * Ignnore this if you still want it ok go ahead.. :)
	 */
	public void moveZeroes2(int[] nums) {
		int index = 0;
		int count = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				count++;
			} else {
				nums[index++] = nums[i];
			}
		}

		for (int i = nums.length - 1; i >= 0; i--) {
			if (count == 0)
				break;
			nums[i] = 0;
			count--;
		}
		// System.out.println(Arrays.toString(nums));
	}

}