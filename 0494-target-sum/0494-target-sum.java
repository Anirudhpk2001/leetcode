class Solution {
    int[][] dp;
    private int recursion(int[] nums,int target,int index,int sum)
    {
        if(index == nums.length)
        {
            return (sum == target)? 1:0;
        }

        int plus = recursion(nums,target,index+1,sum+nums[index]);
        int minus = recursion(nums,target,index+1, sum-nums[index]);

        return plus+minus;
    }
    public int findTargetSumWays(int[] nums, int target) {
      
        return recursion(nums,target,0,0);
    }
}