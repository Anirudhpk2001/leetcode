class Solution {
    int dp[][];
    int m;
    int n;

    private int solve(int[][] grid, int i,int j)
    {
        if(i>=m || j>=n)
        {
            return 0;
        }

        if(i==m-1 && j==n-1)
        {
            return grid[m-1][n-1];
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }

        int right=Integer.MAX_VALUE;

        if(i+1<m)
        {
            right=grid[i][j] + solve(grid,i+1,j);
        }
         int down=Integer.MAX_VALUE;

        if(j+1<n)
        {
            down=grid[i][j] + solve(grid,i,j+1);
        }


        return dp[i][j]=Math.min(right,down);
    }
    public int minPathSum(int[][] grid) {
        dp=new int[grid.length][grid[0].length];
        m=grid.length;
        n=grid[0].length;
        for(int d[]:dp)
        {
            Arrays.fill(d,-1);
        }

        return solve(grid,0,0);
    }
}