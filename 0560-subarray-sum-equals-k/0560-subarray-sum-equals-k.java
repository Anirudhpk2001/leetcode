class Solution {
    public int subarraySum(int[] nums, int k) {
        int curr_sum = 0;
        int result = 0;

        HashMap<Integer,Integer> map = new HashMap<>();
        map.put(0,1);
        for(int i=0;i<nums.length;i++)
        {
            curr_sum+=nums[i];

            result+= map.getOrDefault(curr_sum-k,0);

            map.put(curr_sum,map.getOrDefault(curr_sum,0)+1);
        }

        return result;
    }
}