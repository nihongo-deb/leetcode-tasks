package org.nihongo_deb.LongestSubstringWithoutRepeatingCharacters;

/**
 * @author KAWAIISHY
 * @project leetcode-tasks
 * @created 16.03.2023
 */
public class Solution {
    public int lengthOfLongestSubstring(String s) {
        StringBuilder maxStr = new StringBuilder();
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++){
            if (maxStr.toString().indexOf(s.charAt(i)) == -1){
                maxStr.append(s.charAt(i));
            } else {
                if (maxLength < maxStr.toString().length()){
                    maxLength = maxStr.toString().length();
                }
                maxStr = new StringBuilder();
            }
        }

        if (maxLength < maxStr.toString().length()){
            maxLength = maxStr.toString().length();
        }
        return maxLength;
    }
}
