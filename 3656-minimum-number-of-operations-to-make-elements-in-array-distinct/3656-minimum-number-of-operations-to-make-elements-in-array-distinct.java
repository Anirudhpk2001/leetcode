class Solution {
    public int minimumOperations(int[] nums) {
        HashSet<Integer> set=new HashSet<>();

        int n=nums.length;
        int index=-1;
        for(int i=n-1;i>=0;i--)
        {
            if(set.contains(nums[i]))
            {
                index=i;
                break;
            }
            else
            {
                set.add(nums[i]);

            }
            
        }

        if(index==-1)
        {
            return 0;
        }
        // if(index==0)
        // {
        //     return 1;
        // }
        int res=0;
        int count=0;
        while(res<=index)
        {
            res=res+3;
            count++;
        }

        return count;

    }
}