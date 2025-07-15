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
    public int getDecimalValue(ListNode head) {
        
        int len = 0;
        ListNode curr = head;
        while(curr != null)
        {
            len++;
            curr = curr.next;
        }
        len--;
        int sum=0;
        curr = head;
        while(curr != null)
        {
            if(curr.val == 1)
            {
                sum += Math.pow(2,len);
            }
            len--;
            curr = curr.next;
        }


        return sum;
    }
}