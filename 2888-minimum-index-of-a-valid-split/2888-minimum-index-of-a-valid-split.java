class Solution {
    public int minimumIndex(List<Integer> nums) {
        
        int candidate=0;
        int count=0;
        for(int num:nums)
        {
            if(count==0)
            {
                candidate=num;
            }

            count+=(candidate==num)? 1:-1;
        }

        int totalCount=0;
        for(int num:nums)
        {
            if(candidate==num)
            {
               totalCount++;
            }
        }
        if(totalCount<= (nums.size()-1)/2)
        {
            return -1;
        }

        int preCount=0;
        for(int i=0;i<nums.size();i++)
        {
            if(nums.get(i)==candidate)
            {
                preCount++;
            }

            if(preCount*2 > (i+1) && (totalCount-preCount)*2> nums.size()-(i+1))
            {
                return i;
            }
        }

        return -1;
    }
}