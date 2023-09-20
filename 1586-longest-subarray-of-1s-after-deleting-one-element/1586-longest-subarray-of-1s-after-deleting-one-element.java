class Solution {
    public int longestSubarray(int[] nums) {
       int i=0;
        int j=0;
        int czero=0;
        int size=0;
        while(j<nums.length)
        {       
            if(nums[j]==0)
            {   
                czero++;
            }
            while(czero>1)
            {
                if(nums[i]==0)
                {
                    czero--;
                }
                i++;
            }
            
            size=Math.max(size,j-i);
            j++;

        }
        return size;
}
}