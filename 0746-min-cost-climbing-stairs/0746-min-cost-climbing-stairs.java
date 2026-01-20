class Solution {
    int[] dp;

    private int findCost(int index, int[] cost) {
        if (index >= cost.length) {
            return 0; // reached top
        }

        if (dp[index] != -1) {
            return dp[index];
        }

        return dp[index] = cost[index] +
                Math.min(findCost(index + 1, cost),
                         findCost(index + 2, cost));
    }

    public int minCostClimbingStairs(int[] cost) {
        dp = new int[cost.length];
        Arrays.fill(dp, -1);

        return Math.min(findCost(0, cost), findCost(1, cost));
    }
}
