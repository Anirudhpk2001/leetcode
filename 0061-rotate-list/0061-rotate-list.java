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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null)
        {
            return head;
        }
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = dummy;
        ListNode temp = head;
        int size = 0;
        while(temp!=null)
        {
            size++;
            temp = temp.next;
        }
        System.out.println(size);
        k = k%size;
        System.out.println(k);
        if(k == 0)
        {
            return dummy.next;
        }

        while(k>0 )
        {
           fast = fast.next; 
           k--;
        }


        while(fast.next!=null)
        {
            slow = slow.next;
            fast = fast.next;
        }


        ListNode start = slow.next;
        fast.next = head;

        slow.next = null;
       
       

        return start;
        

    }
}