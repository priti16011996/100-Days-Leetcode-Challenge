/*
 * @lc app=leetcode id=268 lang=java
 *
 * [268] Missing Number
 */

// @lc code=start
class Solution {
    public int missingNumber(int[] nums) {
        int range =nums.length;
        int actualSum = (range*(range+1))/2;
        int currentSum = 0;
        for(int i=0; i<nums.length; i++)
        {
            currentSum = currentSum + nums[i];
        }
        int missingNumber = actualSum -currentSum;
        return missingNumber;
    }
}
// @lc code=end

