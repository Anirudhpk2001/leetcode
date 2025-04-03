class Solution {
    public String breakPalindrome(String palindrome) {

        if(palindrome.length()==1)
        {
            return "";
        }
        StringBuilder str=new StringBuilder(palindrome);

        for(int i=0;i<str.length()/2;i++)
        {
            if(str.charAt(i)!='a')
            {
                str.setCharAt(i, 'a');
                return str.toString();
            }
        }

        str.setCharAt(str.length()-1, 'b');

        return str.toString();
       
    }
}