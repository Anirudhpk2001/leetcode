class Solution {
    int[][] directions;
    int m;
    int n;
    private boolean isValid(int i, int j)
    {
        return (i>=0 && j>=0 && i<m && j<n );
    }
    private void bfs(char[][] board,int i, int j)
    {
        Queue<int[]> q = new LinkedList<>();
        q.add(new int[]{i,j});
        board[i][j] = 'V';

        while(!q.isEmpty())
        {
            int[] current = q.poll();

            for(int[] direction:directions)
            {
                int nx = current[0]+direction[0];
                int ny = current[1]+direction[1];

                if(isValid(nx,ny) && board[nx][ny] == 'O')
                {
                    board[nx][ny] = 'V';
                    q.add(new int[]{nx,ny});
                }
            }
        }
    }
    public void solve(char[][] board) {
        directions = new int[][]{{0,1},{1,0},{-1,0},{0,-1}};
        m = board.length;
        n = board[0].length;
        for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(i == 0 || j==0 || i == m-1 || j == n-1)
                {
                    if(board[i][j] != 'V' && board[i][j] == 'O')
                    {
                        bfs(board,i,j);
                    }
                }
                
            }
        }

          for(int i=0;i<board.length;i++)
        {
            for(int j=0;j<board[0].length;j++)
            {
                if(board[i][j] == 'V')
                {
                    board[i][j] = 'O';
                }
                else if(board[i][j] == 'O')
                {
                    board[i][j] = 'X';
                }
            }
        }
        
    }
}