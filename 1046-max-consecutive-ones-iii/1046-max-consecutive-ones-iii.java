class Solution {
    public int longestOnes(int[] nums, int k) {
        int count_zero = 0;

        int i = 0;
        int j = 0;
        int max_len = 0;

        while(j<nums.length)
        {
            if(nums[j] == 0)
            {
                count_zero++;
            }

            while(count_zero>k)
            {
                if(nums[i]==0)
                {
                    count_zero--;
                }
                i++;
            }

            max_len = Math.max(max_len,j-i+1);
            j++;
        }


        return max_len;

    }
}