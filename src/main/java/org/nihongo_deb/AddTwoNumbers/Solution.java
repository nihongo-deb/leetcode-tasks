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
        ListNode result = l1;
        int remainder = 0;
        while (l1 != null || l2 != null){
            if (l1 != null && l2 != null){
                int sum = l1.val + l2.val + remainder;
                l1.val = sum % 10;
                remainder = sum / 10;

                if (l1.next == null && l2.next != null) {
                    l1.next = new ListNode(0);
                    l1 = l1.next;
                }
                else
                    l1 = l1.next;

                l2 = l2.next;
                continue;
            }

            if (l1 != null && l2 == null){
                int sum = l1.val + remainder;
                l1.val = sum % 10;
                remainder = sum / 10;
                if (l1.next == null && remainder != 0){
                    l1.next = new ListNode(remainder);
                    l1 = l1.next;
                    l1 = l1.next;
                    continue;
                }
                l1 = l1.next;
            }
        }

        return result;
    }
}
