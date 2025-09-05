class Solution {
    public int[] sortedSquares(int[] nums) {
        int leftIndex = 0;
        int rightIndex = nums.length-1;
        int[] result = new int[nums.length];
        int currentIndex = nums.length-1;
        while(leftIndex<=rightIndex)
        {
            if(Math.abs(nums[leftIndex]) >= Math.abs(nums[rightIndex]))
            {
                result[currentIndex] = nums[leftIndex] * nums[leftIndex];
                leftIndex++;
            }
            else
            {
                                result[currentIndex] = nums[rightIndex] *nums[rightIndex];
                rightIndex--;
            }
            currentIndex--;

        }

        return result;
    }
}