/*
 * @lc app=leetcode id=4 lang=java
 *
 * [4] Median of Two Sorted Arrays
 */

// @lc code=start
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] d = mergeSortedArray(nums1, nums2);
        if(d.length % 2 == 0) {
            double ans = ((double) d[d.length / 2] + (double) d[d.length / 2 - 1]) / 2;
            return ans;
        } else {
            return (double) d[d.length / 2];
        }
        
    }

public int [] mergeSortedArray(int[] a , int[] b)
{
    int[] c = new int[a.length+b.length];
    int p1=0;
    int p2=0;
    int p3=0;
    while(p1<a.length || p2<b.length)
    {
        int element1 = p1<a.length?a[p1]:Integer.MAX_VALUE;
        int element2 = p2<b.length?b[p2]:Integer.MAX_VALUE;
        if(element1<element2)
        {
            c[p3] =element1;
            p1++;
        }
        else
        {
            c[p3] =element2;
            p2++;
        }
        p3++;
    }
    return c;
}
}
// @lc code=end

