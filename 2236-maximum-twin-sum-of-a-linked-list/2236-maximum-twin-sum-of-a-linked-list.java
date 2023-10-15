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
    public int pairSum(ListNode head) {
        LinkedList<Integer> ll=new LinkedList<>();

        while(head!=null)
        {
            ll.add(head.val);
            head=head.next;
        }
        int sum=Integer.MIN_VALUE;
        // return ll.getFirst()+ll.getLast();
        while(!ll.isEmpty())
        {
            int a= ll.pollFirst();
            int b=ll.pollLast();
            sum=Math.max(sum,a+b);
           
            
        }
        return sum;

    }
}