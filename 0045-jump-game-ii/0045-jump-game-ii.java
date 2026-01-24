class Solution {
    public int jump(int[] nums) {
        int[] dp = new int[nums.length];
        Arrays.fill(dp,Integer.MAX_VALUE);
        dp[nums.length-1] = 0;

        for(int i= nums.length-2;i>=0;i--)
        {
            for(int j = i+1;j<=i+nums[i] && j<nums.length;j++)
            {
                if(dp[j]!= Integer.MAX_VALUE)
                {
                    dp[i] = Math.min(dp[i],1 + dp[j]);
                }
                
            }
        }

        return dp[0];
    }
}