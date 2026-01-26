class Solution {
    int[][] directions;
    int maxArea;
    int m;
    int n;
    int count;
    private boolean isValid(int x,int y)
    {
        return (x>=0 && y>=0 && x<n && y <m)? true:false;
    }

    private void dfs(int[][] grid, int i, int j)
    {
        grid[i][j] = -1;
        count++;

        for(int[] direction : directions)
        {
            int x = i + direction[0];
            int y = j + direction[1];

            if(isValid(x,y) && grid[x][y]==1)
            {
                dfs(grid,x,y);
            }
        }
        maxArea = Math.max(maxArea,count);
    }
    public int maxAreaOfIsland(int[][] grid) {
        directions = new int[][]{{0,1},{1,0},{0,-1},{-1,0}};
        m = grid[0].length;
        n = grid.length;

        for(int i=0;i<n;i++)
        {
            for(int j=0;j<m;j++)
            {
                if(grid[i][j] != -1 && grid[i][j] == 1)
                {
                    count = 0;
                    dfs(grid,i,j);
                }
            }
        }

        return maxArea;
    }
}