class Solution {
    int[][] t=new int[301][11];

    private int solve(int[] jobDifficulty,int d,int idx)
    {
        if(d==1)
        {
            int maxD=jobDifficulty[idx];

            for(int i=idx;i<jobDifficulty.length;i++)
            {
                maxD=Math.max(jobDifficulty[i],maxD);
            }

            return maxD;
        }
        
        if(t[idx][d]!=-1)
        {
            return t[idx][d];
        }


        int finalResult=Integer.MAX_VALUE;
        int maxD=Integer.MIN_VALUE;

        for(int i=idx;i<=jobDifficulty.length-d;i++)
        {
            maxD        =   Math.max(maxD,jobDifficulty[i]);

            int result  =   maxD+solve(jobDifficulty,d-1,i+1);
            finalResult =   Math.min(finalResult,result);
        }

        return t[idx][d]=finalResult;

    }
    public int minDifficulty(int[] jobDifficulty, int d) {
        int len=jobDifficulty.length;

        if(len<d)
        {
            return -1;
        }
        for(int[] t1:t)
        {
            Arrays.fill(t1,-1);
        }

        return solve(jobDifficulty,d,0);
    }
}