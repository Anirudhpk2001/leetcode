class Solution {
    public int minOperations(int[] nums) {
        
        int count=0;
        for(int i=2;i<nums.length;i++)
        {
            if(nums[i-2]==0)
            {
                for(int j=i-2;j<=i;j++)
                {
                    nums[j]=1-nums[j];
                }
                count++;
            }

        }


        int res=1;
        for(int num:nums)
        {
            res&=num;
        }

        if(res==1)
        {
            return count;
        }
        return -1;
    }
}