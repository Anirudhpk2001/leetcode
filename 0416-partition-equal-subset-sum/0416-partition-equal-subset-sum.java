class Solution {
    int dp[][];
    private boolean recursion(int[] nums, int Totalsum , int index, int currSum)
    {
        if(index>= nums.length)
        {
            return false;
        }

        if(Totalsum/2 == currSum )
        {
            return true;
        }
        if(dp[index][currSum] != -1)
        {
            return (dp[index][currSum] == 1)? true:false;
        }

        boolean take = recursion(nums,Totalsum,index+1,currSum+nums[index]);
        boolean dont_take = recursion(nums,Totalsum,index+1,currSum);

        if((take || dont_take) == true)
        {
            dp[index][currSum] = 1;
            return true;

        }

        dp[index][currSum] = 0;
        return false;

    }
    public boolean canPartition(int[] nums) {
        
        int Totalsum = 0;
        for(int num:nums)
        {
            Totalsum+=num;
        }
        dp = new int[nums.length][Totalsum];
        for(int[] row : dp)
        {
            Arrays.fill(row,-1);
        }

        if(Totalsum%2 != 0)
        {
            return false;
        }

        return recursion(nums,Totalsum,0,0);
    }
}