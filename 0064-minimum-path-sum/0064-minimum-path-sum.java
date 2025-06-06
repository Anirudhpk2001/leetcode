class Solution {
    public int minPathSum(int[][] grid) 
    {
        int row = grid.length;
        int col = grid[0].length;
        int dp[][] = new int[row][col];


        dp[row-1][col-1] = grid[row-1][col-1];

        for(int i = row-1 ;i>=0;i--)
        {
            for(int j=col-1 ; j>=0;j--)
            {   
                if(i == row-1 && j== col-1)
                {
                    continue;
                }
                int down = (i+1 <= row-1) ? dp[i+1][j] : Integer.MAX_VALUE;
                int right = (j+1 <= col-1) ? dp[i][j+1] : Integer.MAX_VALUE;

                dp[i][j] = grid[i][j] + Math.min(down,right);
            }
        }


        return dp[0][0];
    }
}