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
        ListNode duplicateHead = head;
        int counter = 0;
        while (duplicateHead != null) {
            counter++;
            duplicateHead = duplicateHead.next;
        }
        n = counter - n;
        int pointer = 0;
        if (n == 0)
            return head.next;
        else if (n == 1) {
            head.next = head.next.next;
            return head;
        } else {
            duplicateHead = head;
            while ((pointer++ ) != (n-1) && duplicateHead.next.next != null) {
                duplicateHead = duplicateHead.next;
            }
            // remove this element
            duplicateHead.next = duplicateHead.next.next;
            return head;
        }
    }
}