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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        if(head.next == null)
        {
            return null;
        }
        ListNode Dummy = new ListNode(0);
        Dummy.next = head;
        ListNode slow = Dummy;
        ListNode fast = Dummy;
        for(int i=0;i<=n;i++)
        {
            fast=fast.next;
        }

        while( fast!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }

        slow.next = slow.next.next;

        return Dummy.next;
    }
}