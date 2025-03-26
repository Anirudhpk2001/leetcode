import java.util.Arrays;

class Solution {
    int[] memo;

    public int jump(int[] nums) {
        int n = nums.length;
        memo = new int[n];
        Arrays.fill(memo, -1); // Initialize memo with -1 to indicate uncomputed states
        return dp(nums, 0);
    }

    private int dp(int[] nums, int i) {
        if (i >= nums.length - 1) return 0; // Reached the end or beyond
        if (memo[i] != -1) return memo[i]; // Return already computed result

        int minSteps = Integer.MAX_VALUE;
        for (int j = 1; j <= nums[i]; j++) {
            int next = dp(nums, i + j);
            if (next != Integer.MAX_VALUE) {
                minSteps = Math.min(minSteps, 1 + next);
            }
        }

        return memo[i] = minSteps;
    }
}
