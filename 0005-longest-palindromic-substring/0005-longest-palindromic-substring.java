class Solution {
    String str;
    int dp[][];
    private int isPalindrome(int i, int j)
    {
        if(i >= j)
        {
            return 1;
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(str.charAt(i)==str.charAt(j))
        {
            return dp[i][j] = isPalindrome(i+1,j-1);
        }

        return dp[i][j] = 0;
    }
    public String longestPalindrome(String s) {
        str = s;
        int maxLength = Integer.MIN_VALUE;
        dp = new int[s.length()][s.length()];
        for(int[] row : dp)
        {
            Arrays.fill(row,-1);
        }
        int start = 0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(isPalindrome(i,j) == 1)
                {
                    if(j-i+1 > maxLength)
                    {
                        maxLength = j-i+1;
                        start = i; 
                    }
                }
                
            }
        }

        return s.substring(start,start+maxLength);
    }
}