/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) {
 * val = x;
 * next = null;
 * }
 * }
 */
public class Solution {
    public boolean hasCycle(ListNode head) {
        /*
         * so this approach is to create two pointers, fast_runner and slow_runner.
         * fast_runner moves two steps ahead while slow_runner moves one step ahead. if
         * at any point the fast_runner meets the slow_runner (they are pointing at the
         * same node) it means fast_runner jumped through a cycle to get to slow_runner;
         * return true it has a cycle. but if fast_runner gets null, it means it has
         * reached the end of the linked list without re-meeting slow_runner, hence
         * return false.
         */
        if (head == null)
            return false;
        ListNode fast_runner = head.next;
        ListNode slow_runner = head;
        while (fast_runner != null && fast_runner.next != null) {
            if (fast_runner == slow_runner)
                return true;
            fast_runner = fast_runner.next.next; // move two forward
            slow_runner = slow_runner.next; // move one forward
        }
        return false;
        /*
         * so another approach is to create a hashset and add each node to it, if it
         * already exists (cycle) it means it wont add, so return true it has a cycle.
         * but if the entire list is traversed and it adds all nodes successfully, there
         * is no cycle, return true. But this approach takes alot of time (3 ms) and
         * space (beats only 6 % users).
         */
    }
}