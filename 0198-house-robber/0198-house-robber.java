class Solution {
    int dp[];

    private int recursion(int[] nums, int index)
    {
        if(index>= nums.length)
        {
            return 0;
        }
        if(dp[index]!= -1)
        {
            return dp[index];
        }
        int take = nums[index] + recursion(nums,index+2);
        int donttake = recursion(nums,index+1);

        return dp[index] = Math.max(take,donttake);
    }
    public int rob(int[] nums) {
        dp = new int[nums.length+1];
        Arrays.fill(dp,-1);

        return recursion(nums,0);

    }
}