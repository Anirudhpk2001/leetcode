class Solution {
    public boolean increasingTriplet(int[] nums) {
        int left=Integer.MAX_VALUE;
        int right=Integer.MAX_VALUE;
        int n=nums.length;
        for( int i=0;i<n;i++)
        {
            if(nums[i]>right)
            {
                return true;
            }
            if(nums[i]<left)
            {
                left=nums[i];
            }
            if(nums[i]>left && nums[i]<right)
            {
                right=nums[i];
            }
        }
        return false;        
    }
}