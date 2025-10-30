class Solution {
    private void swap(int[] nums,int i, int j)
    {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public void sortColors(int[] nums) {
        int zero_index =0;
        int one_index = 0;
        int two_index = nums.length-1;

        while(one_index<=two_index)
        {
            if(nums[one_index] == 0)
            {
                swap(nums,zero_index,one_index);
                zero_index++;
                one_index++;
            }
            else if(nums[one_index] == 1)
            {
                one_index++;
            }
            else
            {
                swap(nums,one_index,two_index);
                two_index--;
            }
        }


    }
}