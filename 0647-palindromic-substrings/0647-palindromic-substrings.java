class Solution {
    int dp[][];
    private boolean isPalindrome(int i, int j,String s)
    {
        if(i>=j)
        {
            return true;
        }

        if(dp[i][j] != -1)
        {
            return (dp[i][j] == 1)? true:false;
        }

        if(s.charAt(i) == s.charAt(j))
        {
            if(isPalindrome(i+1,j-1,s) == true)
            {
                dp[i][j] = 1;
                return true;
            }
            else
            {
                dp[i][j] = 0;
                return false;
            }
             
        }

        return false;
    }
    public int countSubstrings(String s) {

        dp = new int[s.length()][s.length()];

        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }

        int count = 0;
        for(int i=0;i<s.length();i++)
        {
            for(int j=i;j<s.length();j++)
            {
                if(isPalindrome(i,j,s))
                {
                    count++;
                }
            }
        }

        return count;

    }
}