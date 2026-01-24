class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] answer = new int[nums.length];
        Arrays.fill(answer,1);
        
        int prev = 1;
        for(int i=1;i<nums.length;i++)
        {
            prev = prev*nums[i-1];
            answer[i] = prev;
        }

        prev = nums[nums.length-1];

        for(int i= nums.length-2;i>=0;i--)
        {
            answer[i] = answer[i]*prev;
            prev = prev*nums[i];
        }

        return answer;
    }
}