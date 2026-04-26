class Solution {
    public int missingNumber(int[] nums) {
        int totalSum = (nums.length * (nums.length + 1) )/2;

        for(int num:nums)
        {
            totalSum -= num;
        }

        return totalSum;
    }
}