class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int curr = 0;
        int result_count = 0;
        map.put(0,1);

        for(int i =0;i<nums.length;i++)
        {
            curr += nums[i];

            result_count += map.getOrDefault(curr-k,0);

            map.put(curr,map.getOrDefault(curr,0)+1);

        }

        return result_count;
    }
}