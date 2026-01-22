import java.util.Arrays;

class Solution {
    int[][] directions;
    int[][] dp;
    // int count; // REMOVE THIS from global scope

    private boolean isValid(int m, int n, int x, int y) {
        return (x < m && y < n); // Simplified boolean check
    }

    private int recursion(int m, int n, int i, int j) {
        if (i == m - 1 && j == n - 1) {
            return 1;
        }

        // Check memoization
        if (dp[i][j] != -1) {
            return dp[i][j];
        }

        // DEFINE LOCAL VARIABLE HERE
        // This ensures 'ways' is reset to 0 for every specific cell we visit
        int ways = 0; 

        for (int[] direction : directions) {
            int newx = i + direction[0];
            int newy = j + direction[1];

            if (isValid(m, n, newx, newy)) {
                ways += recursion(m, n, newx, newy);
            }
        }

        // Store and return the local count
        return dp[i][j] = ways;
    }

    public int uniquePaths(int m, int n) {
        dp = new int[m][n]; // [m][n] is sufficient
        directions = new int[][]{{1, 0}, {0, 1}};
        
        for (int[] row : dp) {
            Arrays.fill(row, -1);
        }

        return recursion(m, n, 0, 0);
    }
}