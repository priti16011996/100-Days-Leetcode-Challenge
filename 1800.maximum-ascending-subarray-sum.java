/*
 * @lc app=leetcode id=1800 lang=java
 *
 * [1800] Maximum Ascending Subarray Sum
 */

// @lc code=start
class Solution {
    public int maxAscendingSum(int[] nums) {
        int max=nums[0];
        int curMax = nums[0];

        for(int i=1; i<nums.length; i++)
        {
            if(nums[i-1]<nums[i])
            {
                curMax = curMax +nums[i];
            }
            else
            {
                max = Math.max(curMax,max);
                curMax = nums[i];
            }
        }
        max = Math.max(curMax,max);
        return max;
    }
}
// @lc code=end

