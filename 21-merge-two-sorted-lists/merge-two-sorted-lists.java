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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        if (list1 == null)
            return list2;
        else if (list2 == null)
            return list1;
        ListNode head = null;
        ListNode secondHead = null;
        if (list1.val > list2.val) {
            head = list2;
            secondHead = list1;
        } else {
            head = list1;
            secondHead = list2;
        }
        ListNode duplicateHead = head;
        while (duplicateHead.next != null && secondHead != null) {
            if (secondHead.val <= duplicateHead.next.val) {
                ListNode tempNode = duplicateHead.next;
                duplicateHead.next = secondHead;
                secondHead = secondHead.next;
                duplicateHead.next.next = tempNode;
            } else
                duplicateHead = duplicateHead.next;
        }
        while (secondHead != null) {
            duplicateHead.next = secondHead;
            secondHead = secondHead.next;
            duplicateHead = duplicateHead.next;
        }
        return head;
    }
}