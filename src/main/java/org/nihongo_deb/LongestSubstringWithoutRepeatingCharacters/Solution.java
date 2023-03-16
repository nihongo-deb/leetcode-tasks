package org.nihongo_deb.LongestSubstringWithoutRepeatingCharacters;

/**
 * @author KAWAIISHY
 * @project leetcode-tasks
 * @created 16.03.2023
 */
public class Solution { // dddf
    public int lengthOfLongestSubstring(String s) {
        StringBuilder subString = new StringBuilder();
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++){
            if (subString.toString().indexOf(s.charAt(i)) == -1){
                subString.append(s.charAt(i));
            } else {
                s = s.substring(s.indexOf(s.charAt(i)) + 1, s.length());
                maxLength = Math.max(maxLength, subString.toString().length());
                subString = new StringBuilder();
                i = -1;
            }
        }
        maxLength = Math.max(maxLength, subString.toString().length());

        return maxLength;
    }
}
