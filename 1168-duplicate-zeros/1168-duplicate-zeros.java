class Solution {
    public void duplicateZeros(int[] arr) {
        int n = arr.length - 1;
        int zeroCount = 0;

    
        for (int a : arr) {
            if (a == 0) zeroCount++;
        }

        int i = n;
        int j = n + zeroCount;

        // Traverse backwards
        while (i >= 0) {
            // Copy non-zero or zero if j is within bounds
            if (j <= n) {
                arr[j] = arr[i];
            }

            // If zero, duplicate it
            if (arr[i] == 0) {
                j--;
                if (j <= n) {
                    arr[j] = 0;
                }
            }

            i--;
            j--;
        }
    }
}
