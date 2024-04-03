class Solution {
    boolean visited[][];
    public boolean check(int i,int j, int index,char[][] board, String word)
    {
        if(index==word.length())
        {
            return true;
        }
         if(i<0 || i>=board.length || j<0 || j>=board[0].length || word.charAt(index)!=board[i][j] || visited[i][j])
         {
             return false;
         }
        visited[i][j]=true;
        if(
            check(i+1,j,index+1,board,word)||
             check(i-1,j,index+1,board,word)||
             check(i,j+1,index+1,board,word)||
             check(i,j-1,index+1,board,word)
            )
        {
            
            return true;
        }
        visited[i][j]=false;
        return false;
        }
    
    
    public boolean exist(char[][] board, String word) {
        visited=new boolean[board.length][board[0].length];
        int n=word.length();
        
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[i].length;j++)
            {
                if(board[i][j]==word.charAt(0) && check(i,j,0,board,word))
                {
                    return true;
                }
            }
        }
        return false;
    }
}