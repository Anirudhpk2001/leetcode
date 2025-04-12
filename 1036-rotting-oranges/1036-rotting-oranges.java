class Solution {
    int m;
    int n;
    private boolean isValid(int x , int y)
    {
        if(x>=0 && y>=0 && x<m & y<n)
        {
            return true;
        }

        return false;
    }
    public int orangesRotting(int[][] grid) {
        int[][] directions=new int[][]{{1,0},{-1,0},{0,1},{0,-1}};
        m=grid.length;
        n=grid[0].length;
      

        Queue<int[]> q=new LinkedList<>();

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==2)
                {
                    q.add(new int[]{i,j});
                }
            }
        }

        int count=-1;

        while(!q.isEmpty())
        {
            int size=q.size();
            

            for(int i=0;i<size;i++)
            {
                int[] temp=q.poll();
                int x=temp[0];
                int y=temp[1];

                for(int[] dir:directions)
                {
                    int nx=x+dir[0];
                    int ny=y+dir[1];


                    if(isValid(nx,ny) && grid[nx][ny]==1)
                    {
                        grid[nx][ny]=2;
                        q.add(new int[]{nx,ny});
                    }

                }
            }
            count++;
        }

        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(grid[i][j]==1)
                {
                    return -1;
                }
            }
        }


        return count==-1?0:count;




    }
}