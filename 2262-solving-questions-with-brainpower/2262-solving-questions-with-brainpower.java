class Solution {
    long max=0;
    public long dp(int[][] questions,long[] arr,int idx)
    {
        if(idx>=questions.length)
        {
            return 0;
        }
        if (arr[idx] != -1) {
            return arr[idx];
        }
        
      
        long solve = (long) questions[idx][0] + dp(questions, arr, idx + questions[idx][1] + 1);
        
        long skip = dp(questions, arr, idx + 1);
        
        arr[idx] = Math.max(solve, skip);
        return arr[idx];
    }

    public long mostPoints(int[][] questions) {
        long[] arr=new long[questions.length];
        Arrays.fill(arr,(long)-1);

        arr[questions.length-1]=(long)questions[questions.length-1][0];

        long res=dp(questions,arr,0);


        for(long a:arr)
        {
            res=Math.max(res,a);
        }
        return res;
        
    }
}