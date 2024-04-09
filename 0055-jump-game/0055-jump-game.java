class Solution {
    public boolean canJump(int[] nums) {
        
        int n=nums.length;
        int[] mat=new int[n];
        for(int i=0;i<n;i++)
        {
            mat[i]=0;
        }
        
        
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                mat[0]=1;
            } 
            if(mat[i]==1)
            {
                for(int j=i+1;j<=Math.min(nums[i]+i,n-1);j++)
                {   
                    mat[j]=1;
                }
                  if(mat[n-1]==1)
                    {
                        return true;
                    }
                }
            }
            

        return false;
    }
}