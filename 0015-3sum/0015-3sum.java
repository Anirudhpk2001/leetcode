class Solution {
    List<List<Integer>> result ;
    public void twosum(int target,int[] nums,int left)
    {
        int right = nums.length-1;
        List<Integer> currResult = new ArrayList<>();


        while(left<right)
        {
            if(nums[left]+nums[right]>target)
            {
                right--;
            }
            else if(nums[left]+nums[right]<target)
            {
                left++;
            }
            else
            {
                while(left<right && nums[right] == nums[right-1])
                {
                    right--;
                }

                while(left<right && nums[left] == nums[left+1])
                {
                    left++;
                }
                

                result.add(Arrays.asList(-target,nums[left],nums[right]));
                
                right--;
                left++;

            }
        }
    }
    public List<List<Integer>> threeSum(int[] nums) {
     result = new ArrayList<>();
       Arrays.sort(nums);
       

       for(int i=0;i<nums.length;i++)
       {
            if (i > 0 && nums[i] == nums[i-1]) {
                continue;
            }
            int target = -nums[i];
            
            twosum(target,nums,i+1);
       } 

       return result;
    }
}