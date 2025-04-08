class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> set=new HashSet<>();

        int n=nums.length;
        int index=-1;
        for(int i=n-1;i>=0;i--)
        {
            if(set.contains(nums[i]))
            {
               return (i/3)+1;
                
            }
            else
            {
                set.add(nums[i]);

            }
            
        }

        return 0;

    }
}