class Solution {
    public boolean judgeSquareSum(int c) {
        // If c is zero, 0^2 + 0^2 = 0, so we should return true
        if (c == 0) {
            return true;
        }

        int i = 0;
        int j = (int) Math.sqrt(c);

        // We need to use <= instead of < to handle cases where i and j could be the same.
        while (i <= j) {
            // Cast i and j to long before squaring to prevent overflow
            long sum = (long) i * i + (long) j * j;
            if (sum == c) {
                return true;
            } else if (sum > c) {
                j--;
            } else {
                i++;
            }
        }

        return false;
    }
}
