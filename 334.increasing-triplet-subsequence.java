/*
 * @lc app=leetcode id=334 lang=java
 *
 * [334] Increasing Triplet Subsequence
 */

// @lc code=start
class Solution {
    public boolean increasingTriplet(int[] nums) {
        int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(a >= nums[i]) {
                a = nums[i];
            } else if(b >= nums[i]) {
                b = nums[i];
            } else if(c >= nums[i]) {
                c = nums[i];
                return true;
            }
        }
        return false;
    }
}

// @lc code=end

