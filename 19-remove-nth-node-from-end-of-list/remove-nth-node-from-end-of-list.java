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
        /*
         * so the approach is that we first traverse the linked list from start to end
         * and count how long it is. then we subtract how long it is from n to find
         * which node we have to remove from the START. we subtract 1 as well as we
         * start from 0. then we check, are we removing the first element (head)? if
         * yes, remove it and return the next node after head. if not, start a pointer
         * which moves one node ahead and incremenets itself. it keeps moving until we
         * reach the removing element. now the loop breaks and now we are at the element
         * where we have to remove the NEXT element. so the .next is equal to the
         * .next.next. return head.
         */
        ListNode duplicateHead = head;
        int pointer = 0;
        while (duplicateHead != null) {
            pointer++;
            duplicateHead = duplicateHead.next;
        }
        n = pointer - n;
        if (n == 0)
            return head.next;
        else {
            pointer = 0;
            duplicateHead = head;
            while (pointer++ != n-1)
                duplicateHead = duplicateHead.next;
            // remove this element
            duplicateHead.next = duplicateHead.next.next;
            return head;
        }
    }
}