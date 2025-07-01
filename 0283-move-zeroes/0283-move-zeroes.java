class Solution {
    public void moveZeroes(int[] nums) {
        
        int i = 0;
        int j = 0;
        if(nums.length ==1 )
        {
            return;
        }
        while(j<nums.length)
        {
            while(i<nums.length && nums[i] != 0)
            {
                i++;
            }

            while(j<nums.length && nums[j] == 0)
            {
                j++;
            }
            if(j>=nums.length)
            {
                return;
            }
            if(j<nums.length && i<j)
            {
                nums[i] = nums[j];
                nums[j] = 0;
                i++;
                j++;
            }
            else
            {
                j = i+1;
            }
           
        }
    }
}