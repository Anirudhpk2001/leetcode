class Solution {
    int[][] dp;
    private int recursion(String text1, String text2,int i,int j)
    {
        if(i>=text1.length() || j>=text2.length())
        {
            return 0;
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }

        if(text1.charAt(i) == text2.charAt(j))
        {
           return  dp[i][j] = 1+ recursion(text1,text2,i+1,j+1);
        }


        return dp[i][j] = Math.max(recursion(text1,text2,i,j+1),recursion(text1,text2,i+1,j));

    }
    public int longestCommonSubsequence(String text1, String text2) {
        dp = new int[text1.length()+1][text2.length()+1];

        for(int[] row : dp)
        {
            Arrays.fill(row,-1);
        }

        return recursion(text1,text2,0,0);
    }
}