class Solution {
    public boolean checkValidString(String s) {
        int count_for=0;
        int count_back=0;
        
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(' || s.charAt(i)=='*' )
            {
                count_for++;   
            }
            else
            {
                count_for--;  
            }
            if(s.charAt(s.length()-i-1)==')' || s.charAt(s.length()-i-1)=='*' )
            {
                count_back++;   
            }
            else
            {
                count_back--;  
            }
            if(count_for<0 || count_back<0)
            {
                return false;
            }
        }
        return true;
    }
}