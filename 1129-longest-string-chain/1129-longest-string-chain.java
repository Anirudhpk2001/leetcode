class Solution {
    private boolean isValid(String word1,String word2)
    {
        int i=0;
        int j=0;
        int n=word1.length();
        int m=word2.length();
        if(m!=n-1)
        {
            return false;
        }
        while(i<n)
        {
            
            if(j<m && word1.charAt(i)==word2.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                 i++;
            }
           
            
        }


        return j==m;
    }
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)-> Integer.compare(a.length(),b.length()));

        int t[] =new int[words.length];
        Arrays.fill(t,1);
        int max=0;
        for(int i=0;i<words.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(isValid(words[i],words[j]))
                {
                    t[i]=Math.max(t[i],1+t[j]);

                }
               
            }
             max=Math.max(t[i],max);
        }

        return max;
    }
}