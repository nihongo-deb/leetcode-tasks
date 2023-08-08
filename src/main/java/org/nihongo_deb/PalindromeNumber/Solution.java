package org.nihongo_deb.PalindromeNumber;

/**
 * @author KAWAIISHY
 * @project leetcode-tasks
 * @created 15.05.2023
 */
public class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0)
            return false;

        int buf = x;
        int inverseNumber = 0;

        while (buf != 0){
            inverseNumber *= 10;
            inverseNumber += buf % 10;
            buf /= 10;
        }

        return inverseNumber == x;
    }
}
