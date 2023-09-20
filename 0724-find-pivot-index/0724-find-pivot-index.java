class Solution {
    public int pivotIndex(int[] nums) {
        int leftsum=0;
        
        int pivot=-1;
        for(int i=1;i<nums.length;i++)
        {
            nums[i]+=nums[i-1];
        }
        leftsum=nums[nums.length-1];
        if(leftsum-nums[0]==0)
        {
            return 0;
        }
        for(int j=1;j<nums.length;j++)
        {   
            if(leftsum-nums[j]==nums[j-1])
            {
                pivot=j;
                break;
            }
        }
        return pivot;
       
    }
}