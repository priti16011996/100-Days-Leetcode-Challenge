/*
 * @lc app=leetcode id=167 lang=java
 *
 * [167] Two Sum II - Input Array Is Sorted
 */

// @lc code=start
class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] a = new  int[2];
        int start = 0;
        int end = numbers.length-1;
        while(start<end){
            int sum = numbers[start]+numbers[end];
            if(sum == target) {
                a[0] = start+1;
                a[1] = end+1;
                return a;
            }
            else if(sum > target){
                end--;
            }
            else{
                start++;
            }   
        }
    return a;
    }
}
// @lc code=end

