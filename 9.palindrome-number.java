/*
 * @lc app=leetcode id=9 lang=java
 *
 * [9] Palindrome Number
 */

// @lc code=start
class Solution {
    public boolean isPalindrome(int x) {
        if(x<0)
        {
            return false;

        }
        int number = x;
        int reverseNumber =0;
        while(x>0)
        {
            int lastdigit = x%10;
            reverseNumber = reverseNumber *10 +lastdigit;
            x=x/10;
        }
        if(number == reverseNumber)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
// @lc code=end

