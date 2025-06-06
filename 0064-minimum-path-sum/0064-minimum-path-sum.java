class Solution {
    int[][] dp;
    int row;
    int col;

    private int solve(int[][] grid,int i,int j)
    {
        if(i== row-1 && j == col-1)
        {
            return dp[i][j] = grid[i][j];
        }
        int right = Integer.MAX_VALUE;
        int down = Integer.MAX_VALUE;
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        if(i+1 <= row-1)
        {
            down = grid[i][j]+solve(grid,i+1,j);
        }
        if(j+1 <= col-1)
        {
            right = grid[i][j]+solve(grid,i,j+1);
        }

        return dp[i][j] = Math.min(down,right);

    }
    public int minPathSum(int[][] grid) {
        row = grid.length;
        col = grid[0].length;
        dp = new int[row][col];
        for(int[] dprow : dp)
        {
            Arrays.fill(dprow, -1);
        }

        return solve(grid,0,0);
    }   
}