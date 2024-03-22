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
    public boolean isPalindrome(ListNode head) {
        
       
        ListNode slow=head;
        ListNode fast=head;
   
        
        if(head==null || head.next==null)
        {
            return true;
        }
        while(fast!=null && fast.next!=null )
        {   
          
            slow=slow.next;
            fast=fast.next.next;
            
        }
     
        ListNode temp=null;

        ListNode curr=slow.next;
        while(curr!=null)
        {
            slow.next=temp;
            temp=slow;
            slow=curr;
            curr=curr.next;
        }
        slow.next=temp;
       
        
        ListNode check=head;
        ListNode pal=slow;
        while(check!=null && pal!=null)
        {
            if(check.val==pal.val)
            {
                check=check.next;
                pal=pal.next;
            }
            
            else
            {
                return false;
            }
            
        }
        
        return true;
    }
}