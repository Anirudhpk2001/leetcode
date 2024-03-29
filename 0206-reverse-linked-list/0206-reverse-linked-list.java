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
        
        
        if(head==null )
        {
            return head;
        }
        ListNode prev=null;
        ListNode front=head.next;
        ListNode curr=head;
        
        while(curr.next != null)
        {
                curr.next=prev;
                prev=curr;
                curr=front;
                front=front.next;
                
        }
        curr.next=prev;
        head=curr;
        return head;
    }
}