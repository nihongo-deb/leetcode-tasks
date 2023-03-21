package org.nihongo_deb.MedianofTwoSortedArrays;

import java.util.ArrayList;
import java.util.List;

/**
 * @author KAWAIISHY
 * @project leetcode-tasks
 * @created 17.03.2023
 */
public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result = 0.0;
        int globalArrayLength = nums1.length + nums2.length;
        List<Integer> globalArray = new ArrayList<>();

        int nums1Index = 0;
        int nums2Index = 0;

        boolean done1 = false;
        boolean done2 = false;

        for (int globalIndex = 0; globalIndex < globalArrayLength; globalIndex++) {
            done1 = nums1Index >= nums1.length;
            done2 = nums2Index >= nums2.length;

            if (!done1 && !done2){
                if (nums1[nums1Index] < nums2[nums2Index]){
                    globalArray.add(nums1[nums1Index]);
                    nums1Index++;
                } else
                if (nums1[nums1Index] > nums2[nums2Index]){
                    globalArray.add(nums2[nums2Index]);
                    nums2Index++;
                } else
                if (nums1[nums1Index] == nums2[nums2Index]){
                    globalArray.add(nums1[nums1Index]);
                    globalArray.add(nums2[nums2Index]);
                    nums1Index++;
                    nums2Index++;
                }
            }

            if (!done1 && done2){
                globalArray.add(nums1[nums1Index]);
                nums1Index++;
            }

            if (done1 && !done2){
                globalArray.add(nums2[nums2Index]);
                nums2Index++;
            }
        }

        result = globalArrayLength % 2 == 1
                ? globalArray.get(globalArrayLength / 2)
                : (globalArray.get(globalArrayLength / 2) + globalArray.get(globalArrayLength / 2 - 1)) / 2.0;

        return result;
    }
}
