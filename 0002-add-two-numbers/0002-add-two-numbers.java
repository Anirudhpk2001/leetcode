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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode p = l1, q=l2, dummyhead=new ListNode(0);
        ListNode CurrNode = dummyhead;
        int carry = 0;
        while(p!=null || q!=null)
        {
            int x = (p!=null) ? p.val : 0;
            int y = (q!=null) ? q.val : 0;

            int sum  = x+y+carry;
            carry = sum/10;

            ListNode temp = new ListNode(sum%10);
            CurrNode.next=temp;
            CurrNode= CurrNode.next;

            if(p!=null) p = p.next;
            if(q!=null) q = q.next;
        }
        if (carry > 0) {
            CurrNode.next = new ListNode(carry); // if there's a carry left, add it
        }

        return dummyhead.next;
    }
}