class Solution {
    int m;
    int n;

    private boolean isValid(int x,int y)
    {
        return (x>=0 && y >=0 && x< m && y<n)? true : false;
    }
    public int orangesRotting(int[][] grid) {
        int[][] directions = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        m = grid.length;
        n = grid[0].length;
        Queue<int[]> q = new LinkedList<>();
        int freshOrange = 0;

        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j] == 1)
                {
                    freshOrange++;
                }
                else if(grid[i][j] == 2)
                {
                    q.add(new int[]{i,j});
                }

            }
        }

        if(freshOrange == 0)
        {
            return 0;
        }

        int time=0;
        int orange = 0;

        while(!q.isEmpty())
        {
            int size = q.size();
            for(int i=0;i<size;i++)
            {
                int[] temp = q.poll();
                int x = temp[0];
                int y = temp[1];
                for(int[] direction:directions)
                {
                    int nx = temp[0]+direction[0];
                    int ny = temp[1]+direction[1];

                    if(isValid(nx,ny) && grid[nx][ny] == 1)
                    {   
                        grid[nx][ny] = 2;
                        orange++;
                        q.add(new int[]{nx,ny});
                    }

                }
            }
            time++;
        }

        if(freshOrange!=orange)
        {
            return -1;
        }

        return time-1;
    }
}