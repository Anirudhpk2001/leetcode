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
    public void reorderList(ListNode head) {
        ListNode slow=head,fast=head,temp;
        
        while(fast.next!=null && fast.next.next!=null)
        {
            slow=slow.next;
            fast=fast.next.next;
        }
        
        temp=slow.next;
        slow.next=null;
        
        ListNode prev=null,front=temp;
        while(front!=null)
        {
            front=temp.next;
            temp.next=prev;
            prev=temp;
            temp=front;
        }
        front=head;
        ListNode nodeR, tempR;

        while(prev!=null)
        {  
            nodeR=front.next;
            tempR=prev.next;
            front.next=prev;
            prev.next=nodeR;
            front=nodeR;
            prev=tempR;
        }  
    }
}