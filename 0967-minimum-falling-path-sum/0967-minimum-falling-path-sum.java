class Solution {
    int dp[][];
    int directions[][];
    int min_sum;
    int n;
    int m;
    private boolean isValid(int i , int j)
    {
        if(i<0 || j<0 || j>=m || i>=n )
        {
            return false;
        }
        return true;
    }
    private int solve(int[][] matrix,int i,int j)
    {
        if(i == matrix.length-1)
        {
            return matrix[i][j];
        }
        int sum = Integer.MAX_VALUE;
        if(dp[i][j]!= Integer.MIN_VALUE)
        {
            return dp[i][j];
        }
        for(int dir[]:directions)
        {
            int nx = i+dir[0];
            int ny = j+dir[1];

            if(isValid(nx,ny))
            {
                sum = Math.min(matrix[i][j]+solve(matrix,nx,ny),sum);
            }

            
        }

        return dp[i][j]=sum;
    }
    public int minFallingPathSum(int[][] matrix) {
        n=matrix.length;
        m=matrix[0].length;
        directions=new int[][]{{1,-1},{1,0},{1,1}};
        dp=new int[n][m];
        for(int d[]:dp)
        {
            Arrays.fill(d,Integer.MIN_VALUE);
        }
        min_sum=Integer.MAX_VALUE;
        for(int col=0;col<matrix[0].length;col++)
        {
            min_sum=Math.min(min_sum,solve(matrix,0,col));
        }
        
        return min_sum;
    }
}