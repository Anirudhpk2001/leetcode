class Solution {
    public int compress(char[] chars) {
       
        if(chars.length==1)
        {
            return 1;
        }

        int count=1;
        String s="";
        int j=chars.length;
        int index=0;
        for(int i=1;i<=j;i++)
        {   count=1;
            while(i<j && chars[i]==chars[i-1])
            {
                count++;
                i++;
            }
            chars[index++]=chars[i-1];
            if(count!=1)
            {
                s=String.valueOf(count);
                for( char a : s.toCharArray())
                {
                    chars[index++]=a;
                }
            }
        }
        return index;
    }
}