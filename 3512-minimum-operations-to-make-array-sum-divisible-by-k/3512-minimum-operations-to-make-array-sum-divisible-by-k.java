class Solution {
    public int minOperations(int[] nums, int k) {
        int total_sum =0;
        for(int num:nums)
        {
            total_sum+=num;
        }

        return total_sum%k;
    }
}