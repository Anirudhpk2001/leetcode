class Solution {
    
    public int encrypt(int num)
    {
        int max=0;
        int n=String.valueOf(num).length();
        if(n==1)
        {
            return num;
        }
       
        while(num>0)
        {
            int temp=num%10;
            max=Math.max(max,temp);
            num/=10;
        }
        int final_num=0;
        for(int i=0;i<n;i++)
        {
            final_num=final_num*10 + max;
        }
        return final_num;
        
    }
    public int sumOfEncryptedInt(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=encrypt(nums[i]);
        }
        return sum;
    }
}