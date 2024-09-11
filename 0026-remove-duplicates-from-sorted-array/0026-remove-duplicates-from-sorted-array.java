class Solution {
    public int removeDuplicates(int[] nums) {
        int count=1;
        int curr=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            if(nums[count-1]<nums[i])
            {
                nums[count]=nums[i];
                count++;
            }

        }
        return count;
    }
}