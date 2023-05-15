package org.nihongo_deb.ReverseInteger;

/**
 * @author KAWAIISHY
 * @project leetcode-tasks
 * @created 12.04.2023
 */
public class Solution {
    public int reverse(int x) {
        int max = 2_147_483_647;
        int min = -2_147_483_648;
        int div = 1_000_000_000;

        int result = 0;
        int isNegative = 1;

        int checkX = x;

        if (x > 0) {
            if (x / 1_000_000_000 > 0) {
                while (checkX != 0) {
                    if (checkX % 10 > max / div)
                        return 0;
                    if (checkX % 10 == max / div) {
                        checkX /= 10;
                        max %= div;
                        div /= 10;
                    }
                    if (checkX % 10 < max / div) {
                        break;
                    }
                }
            }
        } else if (x < 0) {
            isNegative = -1;
            if (x / 1_000_000_000 < 0) {
                while (checkX != 0) {
                    if (checkX % 10 < min / div)
                        return 0;
                    if (checkX % 10 == min / div) {
                        checkX /= 10;
                        max %= div;
                        div /= 10;
                    }
                    if (checkX % 10 > min / div) {
                        break;
                    }
                }
            }
        }

        while (x > 0){
            result *= 10;
            result += x % 10;
            x /= 10;
        }

        result *= isNegative;

        return result;
    }
}
