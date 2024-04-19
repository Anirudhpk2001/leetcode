class Solution {
    int num_island=0;
    public void DFS(char[][] grid ,int i,int j ){
        
        grid[i][j]='2';
        if(i>0 && grid[i-1][j]=='1')
        {
            DFS(grid,i-1,j);
        }
        if(i<grid.length-1 && grid[i+1][j]=='1')
        {
            DFS(grid,i+1,j);
        }
        if(j>0 && grid[i][j-1]=='1')
        {
             DFS(grid,i,j-1);
        }
         if(j<grid[0].length-1 && grid[i][j+1]=='1')
        {
            DFS(grid,i,j+1);
        }
        
    }
    
    public int numIslands(char[][] grid) {
        
        
        Stack<Pair<Integer,Integer>> st=new Stack<>(); 
        
        for(int i=0;i<grid.length;i++)
        {
            for(int j=0;j<grid[0].length;j++)
            {
                if(grid[i][j]=='1')
                {   
                    num_island++;
                   DFS(grid,i,j)   ;
                }
            }
        }
        return num_island;
    }
}