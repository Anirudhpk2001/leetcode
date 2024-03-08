class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        int maxval=0;
        int count_freq=0;
        for(int i=0;i<nums.length;i++)
        {
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
        }
        for(int val:hm.values())
        {
            maxval=Math.max(maxval,val);
        }
        for(int val:hm.values())
        {
            if(maxval==val)
            {
              count_freq+=maxval;  
            }
        }
        return count_freq;
    }
}