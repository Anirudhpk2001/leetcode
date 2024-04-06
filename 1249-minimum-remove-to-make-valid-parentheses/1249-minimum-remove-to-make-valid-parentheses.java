class Solution {
    public String minRemoveToMakeValid(String s) {
        int count=0;
        String ans="";
        String temp="";
        for(char ch:s.toCharArray())
        {   
            if(ch==')' && count==0)
            {
                continue;
            }
            else if(ch==')' && count>0)
            {
                count--;
                ans+=ch;
            }
            else if(ch=='(')
            {
                count++;
                ans+=ch;
            }
            else
            {
                ans+=ch;
            }
        }
        if(count>0)
        {   
            int count1=0;
            
            for(int i=ans.length()-1;i>=0;i--)
            {
                if(ans.charAt(i)=='(' && count1==0)
            {
                continue;
            }
            else if(ans.charAt(i)=='(' && count1>0)
            {
                count1--;
                temp=ans.charAt(i)+temp;
            }
            else if(ans.charAt(i)==')')
            {
                count1++;
                temp=ans.charAt(i)+temp;
            }
            else
            {
                temp=ans.charAt(i)+temp;
            }
            }
            return temp;
        }
        
        return ans;
    }
}