package org.nihongo_deb.AddTwoNumbers;

/**
 * @author KAWAIISHY
 * @project leetcode-tasks
 * @created 16.03.2023
 */
public class Solution {
    public Solution() {

    }

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int digit_1 = 0;
        int digit_2 = 0;

        ListNode result = new ListNode(0);
        ListNode toReturn = result;
        int remainder = 0;
        while (l1 != null || l2 != null || remainder != 0){
            result.next = new ListNode(0);
            result = result.next;

            digit_1 = l1 != null ? l1.val : 0;
            digit_2 = l2 != null ? l2.val : 0;

            result.val = (digit_1 + digit_2 + remainder) % 10;
            remainder = (digit_1 + digit_2 + remainder) / 10;

            if (l1 != null)
                l1 = l1.next != null ? l1.next : null;
            if (l2 != null)
                l2 = l2.next != null ? l2.next : null;
        }

        return toReturn.next;
    }
}
