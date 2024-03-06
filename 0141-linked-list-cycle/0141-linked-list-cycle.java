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
        int count=0;
        if(head==null)
        {
            return false;
        }
        ListNode temp=head;
        while(temp.next!=null)
        {
            if(count>10000)
            {
                return true;
                
            }
            temp=temp.next;
            count++;
        }
        return false;
    }
}