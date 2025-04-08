class Solution {
    public int lengthOfLIS(int[] nums) {
        int[] t=new int[nums.length];

        Arrays.fill(t,1);
        int max=1;
        for(int i=0;i<nums.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(nums[i]>nums[j])
                {
                    t[i]=Math.max(t[i],t[j]+1);
                    max=Math.max(max,t[i]);
                }
            }
        }


        return max;
    }
}