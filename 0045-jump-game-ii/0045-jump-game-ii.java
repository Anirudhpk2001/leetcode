class Solution {
    public int jump(int[] nums) {
        int low = 0;
        int high = 0;
        int min_steps = 0;
        for(int i=0;i<nums.length-1;i++)
        {
            high = Math.max(high,i+nums[i]);

            if(i == low)
            {
                min_steps++;
                low = high;
            }

        }

        return min_steps;
    }
}