class Solution {
    public int longestOnes(int[] nums, int k) {
        int i = 0;
        int j = 0;
        int count_one = 0;
        int max_count = 0;
        while(j<nums.length)
        {
            if(nums[j] == 1)
            {
                count_one++;
                j++;
            }
            else if(nums[j] == 0 && k>0)
            {
                count_one++;
                k--;
                j++;
            }
            else if(nums[j] == 0 && k<=0)
            {
               max_count = Math.max(max_count,count_one);
               while(i<=j && k==0)
               {
                    if(nums[i] == 1)
                    {
                        count_one--;
                    }
                    else
                    {
                        count_one--;
                        k++;
                    }
                    i++;
               }


            }

        }
        max_count = Math.max(max_count,count_one);


        return max_count;
    }
}