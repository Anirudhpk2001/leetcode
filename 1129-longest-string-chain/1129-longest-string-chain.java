class Solution {
      int dp[][];
        int n;

        private boolean isValid(String longer,String shorter)
        {
            if(longer.length()-shorter.length()!=1)
            {
                return false;
            }

            int i=0;
            int j=0;

            while(i<longer.length())
            {
                if(j<shorter.length() && longer.charAt(i)==shorter.charAt(j))
                {
                    j++;
                }
                i++;
            }

            return j==shorter.length();
        }

     public int solve(int index,int p,String[] words)
    {
        if(index>=n)
        {
            return 0;
        }

        if(dp[index][p+1]!=-1)
        {
            return dp[index][p+1];
        }
        int take=0;
        if(p==-1 ||isValid(words[index],words[p]))
        {
             take=1+solve(index+1,index,words);
        }
        int skip=solve(index+1,p,words);

        return dp[index][p+1]=Math.max(take,skip);
        
    }
    public int longestStrChain(String[] words) {
        Arrays.sort(words,(a,b)-> Integer.compare(a.length(),b.length()));

        n = words.length;
        dp = new int[n][n + 1];
        for(int[] d:dp)
        {
            Arrays.fill(d,-1);
        }

        return solve(0,-1,words);


    }
}