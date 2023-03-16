package org.nihongo_deb;

import org.nihongo_deb.AddTwoNumbers.ListNode;
import org.nihongo_deb.AddTwoNumbers.Solution;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args) {
//        ListNode l1 = new ListNode(9, new ListNode(9,new ListNode(9, new ListNode(9,new ListNode(9, new ListNode(9,new ListNode(9)))))));
//        ListNode l2 = new ListNode(9, new ListNode(9, new ListNode(9, new ListNode(9))));

//        ListNode l1 = new ListNode(5, new ListNode(6, new ListNode(4)));
//        ListNode l2 = new ListNode(2, new ListNode(4, new ListNode(3)));

        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);

        Solution solution = new Solution();
        ListNode sum = solution.addTwoNumbers(l1, l2);

        while (sum != null){
            System.out.println(sum.val);
            sum = sum.next;
        }
    }
}
