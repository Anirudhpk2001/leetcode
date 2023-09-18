class Solution {
    public int longestOnes(int[] nums, int k) {
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
            while(czero>k)
            {
                if(nums[i]==0)
                {
                    czero--;
                }
                i++;
            }
            
            size=Math.max(size,j-i+1);
            j++;

        }
        return size;

    }
}