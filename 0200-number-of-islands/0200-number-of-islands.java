class Solution {
    int[][] directions;
    int m;
    int n;
    private boolean isValid(int x,int y)
    {
        return x>=0 && y>=0 && x<m && y<n;
    }
    private void dfs(char[][] grid ,int x,int y )
    {
        if(!isValid(x,y))
        {
            return;
        }

        grid[x][y]='2';

        for(int[] dir:directions)
        {
            int nx=x+dir[0];
            int ny=y+dir[1];
            if(isValid(nx,ny) && grid[nx][ny]=='1')
            {
                dfs(grid,nx,ny);
            }
            
        }
    }
    public int numIslands(char[][] grid) {
        directions=new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        m=grid.length;
        n=grid[0].length;
        int Num_of_Islands=0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {
                    Num_of_Islands++;
                    dfs(grid,i,j);
                }
            }
        }

        return Num_of_Islands;

    }
}