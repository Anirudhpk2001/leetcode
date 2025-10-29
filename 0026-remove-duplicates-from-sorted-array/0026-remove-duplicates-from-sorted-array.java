class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0;
        int j = 0;

        while(j<nums.length)
        {
            while(j<nums.length && nums[j] == nums[i])
            {
                j++;
            }

            if(j<nums.length)
            {
                nums[i+1] = nums[j];
                i++;
            }
            
            

        }
        return i+1;
    }
}