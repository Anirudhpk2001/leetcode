class Solution {
    int m;
    int n;
    private boolean isValid(int i, int j)
    {
        return (i>=0 && j>=0 && i<m && j<n);
    }
    public int orangesRotting(int[][] grid) {
        m = grid.length;
        n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int fresh = 0;
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 1)
                {
                    fresh++;
                }
                else if(grid[i][j] == 2)
                {
                    q.add(new int[]{i,j});
                }
            }
        }

        if(q.isEmpty() )
        {
            if(fresh == 0)
            {
                return 0;
            }
            return -1;
        }
        


        int minutes = 0;
        int[][] directions = new int[][]{{1,0},{0,1},{-1,0},{0,-1}};
        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                int[] temp = q.poll();
                for(int[] dir: directions)
                {
                    int nx = dir[0] + temp[0];
                    int ny = dir[1] + temp[1];

                    if(isValid(nx,ny) && grid[nx][ny] == 1)
                    {
                        grid[nx][ny] = 2;
                        fresh--;
                        q.add(new int[]{nx,ny});
                    }
                }
            }
            minutes++;
        }
        if(fresh>0)
        {
            return -1;
        }

        return minutes-1;
    }
}