/*
 * @lc app=leetcode id=747 lang=java
 *
 * [747] Largest Number At Least Twice of Others
 */

// @lc code=start
class Solution {
    public int dominantIndex(int[] nums) {
        int max =-1;
        int secondMax =-1;
        int Imax =0;

        for(int i=0; i<nums.length;i++)
        {
            if(nums[i]>max)
            {
                secondMax =max;
                max = nums[i];
                Imax =i;
            }
            else if(nums[i]>secondMax)
            {
                secondMax = nums[i];
            }
        }

        if(secondMax * 2 <= max)
        {
            return Imax;
        }
        else
        {
            return -1;
        }


        
    }
}
// @lc code=end

