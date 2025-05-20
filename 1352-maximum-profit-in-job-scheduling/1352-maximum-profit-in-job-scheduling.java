import java.util.*;

class Solution {

    private int binarySearch(int[][] arr, int target) {
        int left = 0, right = arr.length - 1;
        int result = arr.length;

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid][0] >= target) {
                result = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return result;
    }

    private int solve(int[][] arr, int idx, int[] dp) {
        if (idx >= arr.length) return 0;
        if (dp[idx] != -1) return dp[idx];

        int notTake = solve(arr, idx + 1, dp);
        int next = binarySearch(arr, arr[idx][1]);
        int take = arr[idx][2] + solve(arr, next, dp);

        return dp[idx] = Math.max(take, notTake);
    }

    public int jobScheduling(int[] startTime, int[] endTime, int[] profit) {
        int n = startTime.length;
        int[][] arr = new int[n][3];
        for (int i = 0; i < n; i++) {
            arr[i][0] = startTime[i];
            arr[i][1] = endTime[i];
            arr[i][2] = profit[i];
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> a[0])); 

        int[] dp = new int[n];
        Arrays.fill(dp, -1);

        return solve(arr, 0, dp);
    }
}
