/*
 * @lc app=leetcode id=11 lang=java
 *
 * [11] Container With Most Water
 */

// @lc code=start
class Solution {
    public int maxArea(int[] height) {
        int start = 0;
        int end = height.length - 1;
        int maxCapacity = 0;

        while (start < end) {
            int capacity = Math.min(height[start], height[end]) * (end - start);
            maxCapacity = Math.max(maxCapacity, capacity);

            if (height[start] < height[end]) {
                start++;
            } else {
                end--;
            }
        }
        return maxCapacity;
    }
}
// @lc code=end

