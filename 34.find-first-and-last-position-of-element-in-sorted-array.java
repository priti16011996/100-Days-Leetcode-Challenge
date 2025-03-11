/*
 * @lc app=leetcode id=34 lang=java
 *
 * [34] Find First and Last Position of Element in Sorted Array
 */

// @lc code=start
class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] a = {-1,-1};
        if(nums.length==0)
        {
            return a;
        }
        a[0] = firstElement(nums,target);
        a[1] = lastElement(nums,target);
        return a;
    }

    public int firstElement(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while(start <= end)
        {
            int mid = (start + end)/2;
            if(nums[mid] == target)
            {
                ans = mid;
                end = mid-1;
            }
            else if(target>nums[mid])
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return ans;
    }
    public int lastElement(int[] nums, int target)
    {
        int start = 0;
        int end = nums.length-1;
        int ans = -1;

        while(start <= end)
        {
            int mid = (start + end)/2;
            if(nums[mid] == target)
            {
                ans = mid;
                start = mid+1;
            }
            else if(target>nums[mid])
            {
                start = mid+1;
            }
            else
            {
                end = mid-1;
            }
        }
        return ans;
    }
}
// @lc code=end

