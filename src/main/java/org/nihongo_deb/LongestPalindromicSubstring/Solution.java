package org.nihongo_deb.LongestPalindromicSubstring;

/**
 * @author KAWAIISHY
 * @project leetcode-tasks
 * @created 21.03.2023
 */
public class Solution {
    public String longestPalindrome(String s) {
        String maxPalindrome = "" + s.charAt(0);

        for (int i = 0; i < s.length() - 1; i++){
            for (int k = i + 1; k < s.length(); k++)
                if (s.charAt(i) == s.charAt(k)) {
                    String substring = s.substring(i, k + 1);
                    if (isPalindrome(substring))
                        maxPalindrome = substring.length() > maxPalindrome.length() ? substring : maxPalindrome;
                }
        }
        return maxPalindrome;
    }

    public boolean isPalindrome(String s){
        for (int i = 0; i < s.length() / 2; i++){
            if (s.charAt(i) != s.charAt(s.length() - 1 - i))
                return false;
        }
        return true;
    }
}
