class Solution {
    public int jump(int[] nums) {
        if (nums.length <= 1) return 0; // No jumps needed if already at the end

        int jumps = 0;
        int currentMaxReach = 0;
        int nextMaxReach = 0;

        for (int i = 0; i < nums.length - 1; i++) {
            nextMaxReach = Math.max(nextMaxReach, i + nums[i]);
            
            // If we reach the end of the current reach, we jump
            if (i == currentMaxReach) {
                jumps++;
                currentMaxReach = nextMaxReach;

                // If we have already reached or passed the end
                if (currentMaxReach >= nums.length - 1) {
                    break;
                }
            }
        }
        return jumps;
    }
}
