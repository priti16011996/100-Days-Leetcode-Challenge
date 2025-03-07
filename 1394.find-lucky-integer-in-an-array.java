/*
 * @lc app=leetcode id=1394 lang=java
 *
 * [1394] Find Lucky Integer in an Array
 */

// @lc code=start
class Solution {
    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each number
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int result = -1;

        // Check for lucky numbers
        for (int key : map.keySet()) {
            if (key == map.get(key)) {
                result = Math.max(result, key);
            }
        }

        return result;
    }
}

// @lc code=end

