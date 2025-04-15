class Solution {
    public long goodTriplets(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int[] position = new int[n];

        // Map value to its index in nums2
        for (int i = 0; i < n; i++) {
            position[nums2[i]] = i;
        }

        long[] left = new long[n];
        long[] right = new long[n];

        FenwickTree tree = new FenwickTree(n + 2);

        // Count how many elements are smaller to the left
        for (int i = 0; i < n; i++) {
            int idx = position[nums1[i]];
            left[i] = tree.query(idx - 1);
            tree.update(idx, 1);
        }

        tree = new FenwickTree(n + 2);

        // Count how many elements are greater to the right
        for (int i = n - 1; i >= 0; i--) {
            int idx = position[nums1[i]];
            right[i] = tree.query(n) - tree.query(idx);
            tree.update(idx, 1);
        }

        long result = 0;
        for (int i = 0; i < n; i++) {
            result += left[i] * right[i];
        }

        return result;
    }
}

class FenwickTree {
    int[] bit;

    FenwickTree(int size) {
        bit = new int[size];
    }

    // Update index by value
    public void update(int i, int val) {
        i++;
        while (i < bit.length) {
            bit[i] += val;
            i += i & -i;
        }
    }

    // Query prefix sum from 0 to i
    public int query(int i) {
        i++;
        int sum = 0;
        while (i > 0) {
            sum += bit[i];
            i -= i & -i;
        }
        return sum;
    }
}