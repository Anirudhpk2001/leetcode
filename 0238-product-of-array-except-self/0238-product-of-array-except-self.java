class Solution {
    public int[] productExceptSelf(int[] nums) {
        int count =1;
        int[] res = new int[nums.length];

        for(int i=0;i<nums.length;i++)
        {
            res[i] = count;
            count = count*nums[i];
        }
        count = 1;

        for(int i= nums.length-1;i>=0;i--)
        {
            res[i] *= count;
            count = count*nums[i];
        }

        return res;
    }
}