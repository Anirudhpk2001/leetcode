class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int pre_index = -1;


        for(int i=0;i<nums.length;i++)
        {   
            System.out.println(pre_index);
            if(nums[i] == 1)
            {
                if(pre_index == -1)
                {
                    pre_index = i;
                }
                else
                {
                    if(i-pre_index<=k)
                    {
                        return false;
                    }
                    pre_index = i;
                }
            }
        } 


        return true;
    }
}