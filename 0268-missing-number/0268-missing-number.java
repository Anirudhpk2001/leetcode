class Solution {
    public int missingNumber(int[] nums) {
        int res = 0;
        for(int i =0 ;i<nums.length;i++)
        {
            int temp = nums[i]^i;
            res=res^temp;
        }

        res = res^nums.length;

        return res;
    }
}