class Solution {
    int dp[][];
    private int recursion(int amount,int[] coins,int sum,int index)
    {
        if(sum == amount)
        {
            return 1;
        }

        if(index>=coins.length)
        {
            return 0;
        }

        if(sum>amount)
        {
            return 0;
        }
        if(dp[index][sum]!=-1)
        {
            return dp[index][sum];
        }

        
        int take = recursion(amount,coins,sum+coins[index],index);
        int dont_take = recursion(amount,coins,sum,index+1);

         return dp[index][sum] = take+dont_take;
    }
    public int change(int amount, int[] coins) {
        dp = new int[coins.length][amount+1];

        for(int[] row: dp)
        {
            Arrays.fill(row,-1);
        }


        return recursion(amount,coins,0,0);
    }
}