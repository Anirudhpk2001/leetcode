class Solution {
  
    int m;
    int n;
    int dp[][];
    private int solve(int i ,int j)
    {
        if(i>=m || j>=n)
        {
            return 0;
        }

        if(i==m-1 && j==n-1)
        {
            return 1;
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }

        if(i+1>m)
        {
            return dp[i][j]= solve(i,j+1);
            
        }
         if(j+1>n)
        {
           return dp[i][j]=solve(i+1,n);
            
        }


        return dp[i][j]= solve(i+1,j)+solve(i,j+1);
        
    }
    public int uniquePaths(int m, int n) {
       
        dp=new int[m][n];

        for(int d[]:dp)
        {
            Arrays.fill(d,-1);
        }
        this.m=m;
        this.n=n;

        return solve(0,0);

        
    }
}