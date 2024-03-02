class Solution {
    public int[] sortedSquares(int[] nums) {
        int i=0;
        int j=nums.length-1;
        int[] answer=new int[nums.length];
        int n=nums.length-1;
        
        while(i<=j)
        {
            if(Math.abs(nums[i])>Math.abs(nums[j]))
            {
                answer[n]=nums[i]*nums[i];
                i++;
                n--;
            }
            else
            {
                answer[n]=nums[j]*nums[j];
                j--;
                n--;
                
            }
            
        }
        return answer;
        
    }
}

