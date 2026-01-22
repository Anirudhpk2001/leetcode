class Solution {
    int[][] dp;
    int totalSum;
    private int recursion(int[] nums,int target,int index,int sum)
    {
        if(index == nums.length)
        {
            return (sum == target)? 1:0;
        }

        if(dp[index][totalSum + sum] != Integer.MIN_VALUE)
        {
            return dp[index][totalSum+sum];
        }

        int plus = recursion(nums,target,index+1,sum+nums[index]);
        int minus = recursion(nums,target,index+1, sum-nums[index]);

        return dp[index][totalSum+sum] =  plus+minus;
    }
    public int findTargetSumWays(int[] nums, int target) {
        totalSum = Arrays.stream(nums).sum();
        dp = new int[nums.length][2*totalSum+1];

        for(int[] row : dp)
        {
            Arrays.fill(row,Integer.MIN_VALUE);
        }
        return recursion(nums,target,0,0);
    }
}