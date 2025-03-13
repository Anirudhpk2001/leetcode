class Solution {
    public int lastRemaining(int n) {
        int head = 1;
        int step = 1;
        boolean left = true; // Track elimination direction

        while (n > 1) {
            // If eliminating from the left OR from the right when n is odd
            if (left || n % 2 == 1) {
                head += step;
            }
            // Move to next round
            n /= 2;
            step *= 2; // Step size doubles
            left = !left; // Switch direction
        }
        return head;
    }

    
}
