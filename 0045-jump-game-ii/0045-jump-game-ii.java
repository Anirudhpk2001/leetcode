class Solution {
    public int jump(int[] nums) {
        int start = 0;
        int highestJump = 0;
        int minSteps = 0;
        for(int i=0;i<nums.length-1;i++)
        {
            highestJump = Math.max(highestJump,i+nums[i]);

            if(i == start)
            {
                minSteps++;
                start = highestJump;
            }
        }

        return minSteps;
    }
}