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
    public ListNode reverseList(ListNode head) {

        if(head == null || head.next == null)
        {
            return head;
        }

        ListNode prev = null;
        ListNode present = head;
        ListNode front = head.next;

        while(front != null)
        {
            present.next = prev;
            prev = present;
            present = front;
            front = front.next;
        }

        present.next = prev;
        return present;
    }
}