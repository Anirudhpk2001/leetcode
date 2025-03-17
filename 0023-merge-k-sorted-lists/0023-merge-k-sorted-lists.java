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
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq=new PriorityQueue<>((a,b) -> a.val-b.val);

        for(int i=0;i<lists.length;i++)
        {
            ListNode temp=lists[i];

            while(temp!=null)
            {
                ListNode nlist=new ListNode(temp.val);
                pq.add(nlist);
                temp=temp.next;
            }
        }
        ListNode head=new ListNode();
        ListNode temp=head;
        while(!pq.isEmpty())
        {
            temp.next=pq.poll();
            temp=temp.next;
        }

        return head.next;
    }
}