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
    public ListNode oddEvenList(ListNode head) {

        if(head == null)
        {
            return null;
        }

        if(head.next == null)
        {
            return head;
        }
        ListNode dummyOdd = head;
        ListNode dummyEven = head.next;

        ListNode EvenStart = head.next;

        while( dummyEven!= null && dummyEven.next!=null)
        {
            
            
                dummyOdd.next = dummyEven.next;
                dummyOdd = dummyOdd.next;
            

            
                dummyEven.next = dummyOdd.next;
                dummyEven = dummyEven.next;
            
        }

        dummyOdd.next = EvenStart;

        return head;

    }
}