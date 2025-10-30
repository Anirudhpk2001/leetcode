class Solution {
    public int[] productExceptSelf(int[] nums) {
        // 1 1 2 6
        // 24 12 4 1

        int prev_val = 1;

        int[] res = new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            res[i] = prev_val;
            prev_val = prev_val*nums[i];
        }
        prev_val = 1;

        for(int i=nums.length-1;i>=0;i--)
        {
            res[i] = res[i] * prev_val;

            prev_val = prev_val * nums[i];
        }

        return res;


    }
}