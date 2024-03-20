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
    public ListNode reverseList(ListNode head) {
        /*
         * method: reverses the linked list
         * this method reverses the singly linked list. it gets each node and reverses
         * its link i.e. if A is linked to B , it links B to A so that the links are
         * reveresed
         * then it makes the last node the head node.
         */
        ListNode previousNode = null;
        ListNode duplicateHead = head;
        ListNode temporaryNode;
        while (duplicateHead != null) {
            temporaryNode = duplicateHead.next; // first it saves head's next somewhere
            duplicateHead.next = previousNode; // and makes the head's next null
            previousNode = duplicateHead; // then it makes previous the head (which is only a node)
            duplicateHead = temporaryNode; // and then makes the head equal to head.next
        }
        head = previousNode;
        return head;
    }
}