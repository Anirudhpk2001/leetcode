class Solution {
    public String reversePrefix(String word, char ch) {
        
        int index=0;
        for(int i=0;i<word.length();i++)
        {
            if(word.charAt(i)==ch)
            {
                index=i;
                break;
            }
        }
        
        String sub=word.substring(0,index+1);
        StringBuilder s=new StringBuilder(sub);
        s=s.reverse();
        sub=s.toString();
        String res=sub+word.substring(index+1) ;
        return res;
        
    }
}