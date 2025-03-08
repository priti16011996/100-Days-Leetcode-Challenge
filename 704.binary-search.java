/*
 * @lc app=leetcode id=704 lang=java
 *
 * [704] Binary Search
 */

// @lc code=start
class Solution {
    public int search(int[] nums, int target) {
        int start = 0;
        int end = nums.length-1;

        while(start<= end)
        {
            int mid = start + (end - start) /2;
            if(nums[mid] == target)
            {
                return mid;
            }
            else if(target > nums[mid])
            {
                start = mid +1;
            }
            else
            {
                end = mid -1;
            }
        }
        return -1;
    }
}
// @lc code=end

