package org.nihongo_deb.ZigzagConversion;

/**
 * @author KAWAIISHY
 * @project leetcode-tasks
 * @created 07.04.2023
 */
public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        if (s.length() <= numRows)
            return s;
        int masterDelta = numRows - 2 + numRows;
        int additionalDelta = 0;

        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < numRows; i++){
            stringBuilder.append(s.charAt(i));
            for(int k = i + masterDelta; k < s.length() + (s.length() % numRows); k += masterDelta){
                if (additionalDelta != 0)
                    stringBuilder.append(s.charAt(k - additionalDelta));
                if (k < s.length())
                    stringBuilder.append(s.charAt(k));
            }
            additionalDelta += 2;

            if (additionalDelta == masterDelta)
                additionalDelta = 0;

        }

        return stringBuilder.toString();
    }
}