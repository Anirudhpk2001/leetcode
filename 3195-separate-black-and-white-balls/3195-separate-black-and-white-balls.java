class Solution {
    public long minimumSteps(String s) {
        long result=0;
        
        char[] ch=s.toCharArray();

        int left=0;
        int right=1;

        while(right<ch.length)
        {
            if(ch[left]=='1' && ch[right]=='0')
            {
                ch[left]='0';
                ch[right]='1';
                result+=right-left;
                
            }
            
            if(ch[left]!='1')
            {
                left++;
            }
            right++;
            
        }

        return result;

    }
}