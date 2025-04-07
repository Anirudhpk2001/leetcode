class Solution {
    Boolean[][] dp;

    private boolean solve(int[] nums, int index, int sum, int target) {
        if (sum == target) return true;
        if (sum > target || index >= nums.length) return false;

        if (dp[index][sum] != null) return dp[index][sum];

        // Try taking or skipping the current number
        boolean take = solve(nums, index + 1, sum + nums[index], target);
        boolean skip = solve(nums, index + 1, sum, target);

        return dp[index][sum] = take || skip;
    }

    public boolean canPartition(int[] nums) {
        int total = 0;
        for (int n : nums) total += n;

        if (total % 2 != 0) return false; // must be even to split

        int target = total / 2;

        dp = new Boolean[nums.length][target + 1];
        return solve(nums, 0, 0, target);
    }
}
