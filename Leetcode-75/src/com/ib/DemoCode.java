package com.ib;

import java.util.*;

public class DemoCode {
    public static void main(String[] args) {
        // new PracticeSolution().kidsWithCandies(new int[]{ 2, 3, 5, 1, 3 }, 3);
        // System.out.println(new PracticeSolution().canPlaceFlowers( new int[]{0, 0, 0, 0, 0 }, 2));
        // System.out.println(new PracticeSolution().reverseVowels("leetcode")); //"leotcede"
        // new PracticeSolution().reverseWords("the sky    is blue"); //"blue is sky the"
        // new PracticeSolution().productExceptSelf(new int[] { 10, 20, 30, 40 }); // 24,12,8,6
        // new PracticeSolution().increasingTriplet(new int[] { 20, 100, 10, 12, 5, 13 });
        // new PracticeSolution().moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}

class PracticeSolution {

    public void moveZeroes(int[] nums) {
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

    public boolean increasingTriplet(int[] nums) {
        int n = nums.length;
        int[] minArr = new int[n];
        int min = nums[0];
        for (int i = 0; i < n; i++) {
            minArr[i] = Math.min(min, nums[i]);
            min = minArr[i];
        }
        System.out.println(Arrays.toString(minArr));
        int[] maxArr = new int[n];
        int max = nums[0];
        for (int i = n - 1; i >= 0; i--) {
            maxArr[i] = Math.max(max, nums[i]);
            max = maxArr[i];
        }
        System.out.println(Arrays.toString(maxArr));
        boolean result = false;
        for (int i = 0; i < n; i++) {
            System.out.println(minArr[i] + " " + nums[i] + " " + maxArr[i]);
            if ((minArr[i] < nums[i]) && (nums[i] < maxArr[i])) {
                result = true;
                break;
            }
        }
        System.out.println(result);
        return result;
    }


    public int[] productExceptSelf(int[] nums) {
        int[] out = new int[nums.length];
        int[] prefix = new int[nums.length];
        int[] suffix = new int[nums.length];
        int prodPre = 1;
        for (int i = 0; i < nums.length; i++) {
            prefix[i] = prodPre;
            prodPre = prodPre * nums[i];
        }
        System.out.println(Arrays.toString(prefix));
        int prodPost = 1;
        for (int i = nums.length - 1; i >= 0; i--) {
            suffix[i] = prodPost;
            prodPost = prodPost * nums[i];
        }
        System.out.println(Arrays.toString(suffix));
        for (int i = 0; i < nums.length; i++) {
            out[i] = prefix[i] * suffix[i];
        }
        System.out.println(Arrays.toString(out));
        return out;
    }


    public String reverseWords(String s) {
        String str = s.trim();
        System.out.println(str);

        String[] strArr = str.split("\\ ");
        System.out.println(strArr);

        StringBuilder result = new StringBuilder();
        for (int i = strArr.length - 1; i >= 0; i--) {
            if (!strArr[i].trim().isEmpty()) {
                result.append(strArr[i].strip());
                result.append(" ");
            }
        }
        System.out.println(result.toString().strip());
        return result.toString().strip();
    }


    public String reverseVowels(String s) {
        String revVowels = "";
        StringBuilder result = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            if (checkVowel(s.charAt(i))) {
                revVowels += s.charAt(i);
            }
        }
        System.out.println(revVowels);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (checkVowel(s.charAt(i))) {
                result.append(revVowels.charAt(count++));
            } else {
                result.append(s.charAt(i));
            }

        }
        return result.toString();
    }

    public boolean checkVowel(char c) {
        String vowels = "aeiouAEIOU";
        return vowels.indexOf(c) != -1;
    }


    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int count = 0;
        for (int i = 0; i < flowerbed.length; i++) {
            boolean canFlowerBePlanted = false;
            if (flowerbed[i] == 0) {
                boolean prevCheck = (i == 0 || flowerbed[i - 1] == 0);
                boolean nextCheck = (i == flowerbed.length - 1 || flowerbed[i + 1] == 0);
                if (prevCheck && nextCheck) {
                    flowerbed[i] = 1;
                    canFlowerBePlanted = true;
                }
            }
            if (canFlowerBePlanted) count++;
            System.out.println(Arrays.toString(flowerbed));
        }
        System.out.println(count);
        return count >= n;
    }


    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<>();
        int preMax = 0;
        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > preMax) preMax = candies[i];
        }
        System.out.println(preMax);
        for (int candy : candies) {
            if ((candy + extraCandies) >= preMax) result.add(true);
            else result.add(false);
        }
        return result;
    }
}
