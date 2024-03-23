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
        /*
         * so the approach is that first we check if either one of the lists are null.
         * if yes, then the other one will not need any changes and will be returned
         * normally. then we will check the heads of both lists and deduce which list
         * has a smaller value. the one with the smaller value will be the MAIN list
         * being traversed and will be referred as 'head'. the other one is a side list
         * and will be referred as 'secondHead'. after that we create a duplicateHead so
         * that we can traverse the MAIN list. the side list can be deleted as it will
         * not be returned. so now we start traversing both lists. if the side one has a
         * value smaller than the main's next, we will split the main list, add the
         * side's node and move side list one ahead. if the main has a value smaller
         * than side, move main one ahead. if either the main ends or the side ends,
         * repeat. now if the main has ended but side is still left, add all of sides to
         * main. but if the side has ended and main is left, then they are already in
         * the main so no change. return the main one.
         */
        // so if either one of them are null, return the other
        if (list1 == null)
            return list2;
        else if (list2 == null)
            return list1;
        // now deduce which list will be the main one and which will be the side one
        ListNode head = null;
        ListNode secondHead = null;
        if (list1.val >= list2.val) {
            head = list2;
            secondHead = list1;
        } else {
            head = list1;
            secondHead = list2;
        }
        // now traverse both lists
        ListNode duplicateHead = head;
        while (duplicateHead.next != null && secondHead != null) {
            // if the side one has a smaller value, split the main and add the side node
            if (secondHead.val <= duplicateHead.next.val) {
                ListNode tempNode = duplicateHead.next;
                duplicateHead.next = secondHead;
                secondHead = secondHead.next;
                duplicateHead.next.next = tempNode;
            } // else move forward the main one
            else
                duplicateHead = duplicateHead.next;
        }
        // if the side one is not empty yet but the main one is, add all sides to main
        while (secondHead != null) {
            duplicateHead.next = secondHead;
            secondHead = secondHead.next;
            duplicateHead = duplicateHead.next;
        }
        // but if the side one is empty but main one isnt, no change needed
        return head;
    }
}