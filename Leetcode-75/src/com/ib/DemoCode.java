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
        //System.out.println(new PracticeSolution().isSubsequence("abc", "ahbdc")); // true
        //System.out.println(new PracticeSolution().maxArea2(new int[] { 1, 8, 6, 2, 5, 4, 8, 3, 7 })); // 49
        //System.out.println(new PracticeSolution().maxOperations(new int[] { 1, 2, 3, 4 }, 5)); //2
        //System.out.println(new PracticeSolution().maxOperations(new int[] { 3, 3, 0, 4, 3 }, 6));//1
        //System.out.println(new PracticeSolution().findMaxAverage(new int[] { 1, 12, -5, -6, 50, 3 }, 4)); //12.75
        //System.out.println(new PracticeSolution().maxVowels("abciiidef", 4)); //3
        //System.out.println(new PracticeSolution().longestOnes(new int[] {1,1,1,0,0,0,1,1,1,1,0}, 2)); //6
        System.out.println(new PracticeSolution().largestAltitude(new int[] { -5, 1, 5, 0, -7 }));
    }
}

class PracticeSolution {

    public int largestAltitude(int[] gain) {
        int pre = 0;
        int[] actualHeight =new int[gain.length+1];
        for (int i = 0; i < gain.length; i++) {
            actualHeight[i] = pre;
            pre = pre + gain[i];
        }
        actualHeight[gain.length] = pre;
        System.out.println(Arrays.toString(actualHeight));
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < actualHeight.length; i++) {
            if(actualHeight[i]>max) max = actualHeight[i];
        }
        return max;
    }
    public int longestOnes(int[] nums, int maxFlips) {
        int left =0;
        int right = 0;
        int zero = 0;
        while(right<nums.length){
            if(nums[right] == 0) zero++;
            if(zero>maxFlips)
            {
                if(nums[left] == 0)
                {
                    zero--;
                }
                left++;
            }
            right++;
        }


        return right-left;
    }
    public int maxVowels(String s, int k) {
        int vcount = 0;
        for (int i = 0; i < k; i++) {
            if("aeiouAEIOU".indexOf(s.charAt(i))!=-1){
                vcount++;
                System.out.println(s.charAt(i));
            }
        }
        System.out.println(vcount);
        int maxVcount = vcount;
        for (int i = k; i < s.length(); i++) {
            boolean isNextV = "aeiouAEIOU".indexOf(s.charAt(i))!=-1;
            if(isNextV) ++vcount;
            boolean isPrevV = "aeiouAEIOU".indexOf(s.charAt(i-k))!=-1;
            if (isPrevV) --vcount;
            if(vcount>maxVcount) maxVcount = vcount;
        }
        return maxVcount;
    }

    public double findMaxAverage(int[] nums, int k) {
        double sum = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        double maxSum = sum;
        for (int i = k; i < nums.length; i++) {
                sum = sum + nums[i] - nums[i-k];
                System.out.println(sum);
                if(sum>maxSum) maxSum = sum;
        }
        return maxSum/k;
    }

    public int maxOperations(int[] nums, int k) {
        int l =0;
        int r =nums.length -1;
        int opr = 0;
        while(l < r){
            if(k == (nums[l]+nums[r]) ) {
                opr++;
                l++;
                r--;
            }
            else if(k > (nums[l]+nums[r]))
                l++;
            else
                r--;
        }
        return opr;
    }

    public int maxOperations2(int[] nums, int k) {
        int opr = 0;
        for(int i=0; i<nums.length;i++){
            for(int j = 0; j <nums.length; j++){
                if(k == (nums[i]+nums[j]) && i!=j) {
                    opr++;
                    nums[i] = 0;
                    nums[j] = 0;
                }
            }
        }
        return opr;
    }

    public int maxArea(int[] height) {
        int area = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = 0; j < height.length; j++) {
                int heightM = Math.min(height[i], height[j]);
               int tempArea = heightM * (i-j);
                if(tempArea>area) area = tempArea;
            }
            System.out.println(height[i]);
        }
        return area;
    }

    public int maxArea2(int[] height) {
        int left = 0;
        int right = height.length - 1;
        int area = 0;
        while(left<right) {
            int leftHeight = height[left];
            int rightHeight = height[right];
            int heightMin = Math.min(leftHeight, rightHeight);
            int length = right - left;
            int tempArea = heightMin * length;
            if (tempArea > area) area = tempArea;

            if (rightHeight > leftHeight)
                left++;
            else
                right--;
        }
        return area;
    }

    public boolean isSubsequence(String s, String t) {
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            if(c == s.charAt(index)){
                index++;
            }
        }
        flag = index == s.length();
        return flag;
    }
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
                result.append(strArr[i].trim());
                result.append(" ");
            }
        }
        System.out.println(result.toString().trim());
        return result.toString().trim();
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
