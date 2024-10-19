class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max_one=0;
        int count=0;

        for(int i=0;i<nums.length;i++)
        {   
            if(nums[i]==1)
            {
                count++;
            }
            
            else
            { 
                max_one=Math.max(max_one,count);
                count=0;
            }
        }
        max_one=Math.max(max_one,count);

        return max_one;
    }
}