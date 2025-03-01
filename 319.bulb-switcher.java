/*
 * @lc app=leetcode id=319 lang=java
 *
 * [319] Bulb Switcher
 */

// @lc code=start
class Solution {
    public int bulbSwitch(int n) {
        double sq = Math.sqrt(n);
        double floor = Math.floor(sq);
        return (int)floor;
    }
}
// @lc code=end

