class Solution {
    private int n;
    private int m;
    int[][] directions;
    private boolean check(int i, int j)
    {
        if(i<0 || j<0 || i>= n || j>=m)
        {
            return false;
        }
        return true;
    }
    private void dfs(char[][] grid, int i , int j )
    {
        if(grid[i][j] == '2')
        {
            return;
        }

        if(grid[i][j] == '1')
        {
            grid[i][j] = '2';
        }

        for(int[] direction : directions)
        {
            int nx = direction[0] + i;
            int ny = direction[1] + j;

            if(check(nx,ny) && grid[nx][ny] == '1')
            {
                dfs(grid,nx,ny);
            }
        }

    }
    public int numIslands(char[][] grid) {
        
        n = grid.length;
        m = grid[0].length;

        directions = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};

        int count = 0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]!=2 && grid[i][j] == '1')
                {
                    dfs(grid,i,j);
                    count++;
                }
            }
        }



        return count;
    }
}