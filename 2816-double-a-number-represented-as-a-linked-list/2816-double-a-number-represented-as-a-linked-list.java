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
    public ListNode doubleIt(ListNode head) {
        Stack<ListNode> st=new Stack<>();
        
        ListNode temp=head;
        while(temp!=null)
        {
            st.add(temp);
            temp=temp.next;
        }
        
        Boolean flag=false;
        temp=head;
        while(!st.isEmpty() )
        {   
            ListNode temp1=st.pop();
            if(flag)
            {
                if(temp1.val >4)
                {
                    flag=true;
                }
                else
                {
                    flag=false;
                }
                temp1.val=(temp1.val*2)%10+1;  
            }
            else
            {
                if(temp1.val >4)
                {
                    flag=true;
                }
                else
                {
                    flag=false;
                }
                temp1.val=(temp1.val*2)%10;
                
            }
        }
        if(flag==true && st.isEmpty())
        {
            ListNode l1=new ListNode();
            l1.val=1;
            l1.next=head;
            head=l1;
        }
        return head;
    }
}