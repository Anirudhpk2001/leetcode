class Solution {
    public int minimumRecolors(String blocks, int k) {
        
        int count_w = 0;  // Number of 'W' in the current window of size k
        int min_op;       // Minimum operations to recolor
        
        // Initialize the first window of size k
        for (int j = 0; j < k; j++) {
            if (blocks.charAt(j) == 'W') {
                count_w++;
            }
        }
        
        min_op = count_w;  // Set the initial minimum to the count of 'W' in the first window

        // Sliding window over the rest of the blocks
        for (int i = 1, j = k; j < blocks.length(); i++, j++) {
            // Slide the window: remove the effect of the previous character and add the new one
            if (blocks.charAt(i - 1) == 'W') {
                count_w--;
            }
            if (blocks.charAt(j) == 'W') {
                count_w++;
            }

            // Update the minimum number of operations
            min_op = Math.min(min_op, count_w);
        }

        return min_op;
    }
}
