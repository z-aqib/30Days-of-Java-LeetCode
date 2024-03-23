/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        Set<ListNode> hashTable = new HashSet<>();
        ListNode duplicateHead = head;
        while (duplicateHead != null) {
            if (hashTable.add(duplicateHead) == false) return true;
            duplicateHead = duplicateHead.next;
        }
        return false;
    }
}