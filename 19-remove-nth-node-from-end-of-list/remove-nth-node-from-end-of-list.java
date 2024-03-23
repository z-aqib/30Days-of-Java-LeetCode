/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        System.out.println("given n -> " + n);
        ListNode duplicateHead = head;
        int counter = 0;
        while (duplicateHead != null) {
            counter++;
            duplicateHead = duplicateHead.next;
        }
        n = counter - n;
        System.out.println("removing n -> " + n);
        int pointer = 0;
        if (n == 0)
            return head.next;
        else if (n == 1) {
            head.next = head.next.next;
            return head;
        } else {
            duplicateHead = head;
            while ((pointer++ ) != (n-1) && duplicateHead.next.next != null) {
                System.out.println("duplicateHead.val -> " + duplicateHead.val);
                duplicateHead = duplicateHead.next;
                System.out.println("pointer -> " + pointer);
            }
            // remove this element
            System.out.println("removed -> " + duplicateHead.next.val);
            duplicateHead.next = duplicateHead.next.next;
            return head;
        }
    }
}