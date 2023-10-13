/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode deleteMiddle(ListNode head) {
       if (head == null || head.next == null) {
            return null; // No middle node to delete for lists with 0 or 1 nodes
        }

        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;

        // Move 'fast' two steps and 'slow' one step until 'fast' reaches the end
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }

        // Delete the middle node by skipping it
        // if (prev != null) {
             prev.next=prev.next.next;
        // } else {
            // If the list has only two nodes, update the head
            // head = head.next;
        // }

        return head;
    }
}
