package org.nihongo_deb;

import org.nihongo_deb.MedianofTwoSortedArrays.Solution;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
        int [] nums1 = new int[]{1,3,10,15};
        int [] nums2 = new int[]{2, 41};

        Solution solution = new Solution();

        System.out.println(solution.findMedianSortedArrays(nums1, nums2));
    }
}
