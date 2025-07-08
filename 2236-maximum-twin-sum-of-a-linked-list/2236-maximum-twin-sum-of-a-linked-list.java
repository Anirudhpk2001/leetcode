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

    private ListNode reverse(ListNode head)
    {
        ListNode curr = head;
        ListNode prev = null;
        ListNode front = head.next;

        while(front!=null)
        {
            curr.next = prev;
            prev = curr;
            curr = front;
            front = front.next;
        }

        curr.next = prev;
        return curr;
    }
    public int pairSum(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        ListNode prev = null;
      while(fast!=null && fast.next!=null)
      {
        prev = slow;
        slow = slow.next;
        fast = fast.next.next;
      }  

        prev.next = null;

        ListNode reversed = reverse(slow);
        int maxPairSum = 0;
        while(reversed!=null)
        {
            int val1 = reversed.val;
            int val2 = head.val;
            maxPairSum = Math.max(maxPairSum,val1+val2);
            reversed = reversed.next;
            head = head.next;
        }


        return maxPairSum;


      


    }
}