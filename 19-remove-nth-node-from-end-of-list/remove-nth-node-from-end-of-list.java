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
        int pointer = 0;
        while (duplicateHead != null) {
            pointer++;
            duplicateHead = duplicateHead.next;
        }
        n = pointer - n;
        pointer = 0;
        if (n == 0)
            return head.next;
        else {
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