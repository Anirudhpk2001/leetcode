class Solution {
    int[][] directions;
    int m;
    int n;
    private boolean isValid(int x,int y)
    {
        return (x>=0 && y>=0 && x<m && y<n)? true:false;
    }
    private void dfs(char[][] grid,int i,int j)
    {
        grid[i][j] = '0';

        for(int[] direction:directions)
        {
            int x = direction[0]+i;
            int y = direction[1]+j;

            if(isValid(x,y) && grid[x][y] == '1')
            {
                dfs(grid,x,y);
            }
        }

    }
    public int numIslands(char[][] grid) {
        m = grid.length;
        n = grid[0].length;
        directions = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        int num_of_islands = 0;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j] == '1')
                {
                    dfs(grid,i,j);
                    num_of_islands++;
                }
            }
        }

        return num_of_islands;

    }
}