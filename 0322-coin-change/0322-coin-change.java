class Solution {
    int[] dp;

    private int minCoins(int[] coins, int amount) {
        if (amount == 0) return 0;
        if (amount < 0) return Integer.MAX_VALUE;

        if (dp[amount] != -1) return dp[amount];

        int min = Integer.MAX_VALUE;

        for (int coin : coins) {
            int res = minCoins(coins, amount - coin);
            if (res != Integer.MAX_VALUE) {
                min = Math.min(min, 1 + res);
            }
        }

        return dp[amount] = min;
    }

    public int coinChange(int[] coins, int amount) {
        dp = new int[amount + 1];
        Arrays.fill(dp, -1);

        int result = minCoins(coins, amount);
        return result == Integer.MAX_VALUE ? -1 : result;
    }
}
