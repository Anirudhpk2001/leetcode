class Solution {
    public int minIncrementForUnique(int[] nums) {
        Arrays.sort(nums);
        int min_incr = 0;
        int needed = nums[0]; // the next needed unique value
        
        for (int num : nums) {
            if (num < needed) {
                min_incr += needed - num;
            } else {
                needed = num;
            }
            needed++; // increment to the next required unique value
        }
        
        return min_incr;
    }
}
