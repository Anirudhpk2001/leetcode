/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashSet<ListNode> set = new HashSet<>();

        ListNode dummyheadA = headA;
        ListNode dummyheadB = headB;

        while(dummyheadA!=null)
        {
            set.add(dummyheadA);
            dummyheadA= dummyheadA.next;
        }

        while(dummyheadB!=null)
        {
            if(set.contains(dummyheadB))
            {
                return dummyheadB;
            }
            dummyheadB= dummyheadB.next;
        }


        return null;
    }
}