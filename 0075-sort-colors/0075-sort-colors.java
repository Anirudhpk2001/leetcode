class Solution {

    
    public void sortColors(int[] nums) {
        int pointer0 = 0;
        int pointer1 = 0;
        int pointer2 = nums.length-1;

        while(pointer1<=pointer2)
        {
            if(nums[pointer1] == 1)
            {
                pointer1++;
            }
            else if(nums[pointer1] == 2)
            {
                nums[pointer1] = nums[pointer2];
                nums[pointer2] =2;
                pointer2--;
            }
            else
            {
                nums[pointer1] = nums[pointer0];
                nums[pointer0] = 0;
                pointer0++;
                pointer1++;
                
            }
        }
    }
}