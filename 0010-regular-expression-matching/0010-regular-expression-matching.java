class Solution {
    int[][] dp;

    private boolean solve(String s, String p, int i, int j) {
        if (j == p.length()) {
            return i == s.length();
        }

        if (dp[i][j] != -1) {
            return dp[i][j] == 1;
        }

        boolean match = (i < s.length()) &&
                        (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');

        boolean ans;

        if (j + 1 < p.length() && p.charAt(j + 1) == '*') {
            boolean not_take = solve(s, p, i, j + 2);
            boolean take = match && solve(s, p, i + 1, j);
            ans = not_take || take;
        } else {
            ans = match && solve(s, p, i + 1, j + 1);
        }

        dp[i][j] = ans ? 1 : 0;
        return ans;
    }

    public boolean isMatch(String s, String p) {
        dp = new int[s.length() + 1][p.length() + 1];
        for (int[] arr : dp) {
            Arrays.fill(arr, -1);
        }
        return solve(s, p, 0, 0);
    }
}
