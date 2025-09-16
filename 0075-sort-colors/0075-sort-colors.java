class Solution {
    public void sortColors(int[] nums) {
        int pointer1 = 0;
        int pointer2 = nums.length-1;
        int pointer3 = 0;

        while(pointer3<=pointer2)
        {
            if(nums[pointer3] == 0)
            {
                nums[pointer3] = nums[pointer1];
                nums[pointer1] = 0;
                pointer1++;
            }

            if(nums[pointer3] == 2)
        {
            nums[pointer3] = nums[pointer2];
            nums[pointer2] = 2;
            pointer2--;
            pointer3--;
        }

        pointer3++;
        }

    }
}