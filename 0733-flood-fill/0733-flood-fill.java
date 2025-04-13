class Solution {
    int m;
    int n;
    private boolean isValid(int x, int y)
    {
        if(x>=0 && y>=0 && x<m && y<n)
        {
            return true;
        }

        return false;
    }
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        m=image.length;
        n=image[0].length;
        int[][] directions=new int[][]{{0,1},{1,0},{0,-1},{-1,0}};

        int currcolor=image[sr][sc];

        if(color==currcolor)
        {
            return image;
        }

        Queue<int[]> q=new LinkedList<>();


        q.add(new int[]{sr,sc});
        image[sr][sc]=color;

        while(!q.isEmpty())
        {
            int[] temp=q.poll();
            int x=temp[0];
            int y=temp[1];
            
            for(int[] dir:directions)
            {
                int nx=dir[0]+x;
                int ny=dir[1]+y;
                

                if(isValid(nx,ny) && image[nx][ny]==currcolor)
                {   
                    image[nx][ny]=color;   
                    q.add(new int[]{nx,ny});
                    
                }

            }
        }


        return image;
    }
}