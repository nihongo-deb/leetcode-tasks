package org.nihongo_deb.LongestSubstringWithoutRepeatingCharacters;

/**
 * @author KAWAIISHY
 * @project leetcode-tasks
 * @created 16.03.2023
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int iterNum = s.length();
        int maxLength = 0;
        for (int i = 0; i < iterNum; i++){
            char firstChar = s.charAt(0);
            s = s.substring(1, s.length());
            maxLength = s.indexOf(firstChar) == -1 ? Math.max(maxLength, s.length() + 1) : Math.max(maxLength, s.indexOf(firstChar) + 1);
        }
        return maxLength;
    }
}
