class Solution {
    public int[] productExceptSelf(int[] nums) {
        int ans[]=new int[nums.length];
        Arrays.fill(ans,1);
        
        int cur=1;

        for(int i=0;i<nums.length;i++)
        {
            ans[i]*=cur;
            cur*=nums[i];
        }

        cur=1;
        for(int i=nums.length-1;i>=0;i--)
        {
            ans[i]*=cur;
            cur*=nums[i];
        }
        
        return ans;
    }
}

