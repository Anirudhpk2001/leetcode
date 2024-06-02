class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int result_sum=nums[0]+nums[1]+nums[nums.length-1];

        Arrays.sort(nums);
        
        for( int i=0;i<nums.length-2;i++)
        {
            int left=i+1;
            int right=nums.length-1;
            
            while(left<right)
            {
                int current_sum=nums[i]+nums[left]+nums[right];
                if(current_sum<target)
                {
                    left++;
                }
                else
                {
                    right--;
                }
                
                if(Math.abs(result_sum-target)>Math.abs(current_sum-target))
                {
                    result_sum=current_sum;
                }
               
            }
        }
        return result_sum;
    }
}