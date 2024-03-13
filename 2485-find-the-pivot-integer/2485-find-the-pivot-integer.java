class Solution {
    public int pivotInteger(int n) {
        int leftsum=0;
        int rightsum=0;
        if(n==1)
        {
            return n;
        }
       
        
            rightsum=(n*(n+1))/2;
        
        
        for(int j=1;j<n+1;j++)
        {   
            leftsum=leftsum+j;
         
            if(leftsum==rightsum)
            {
                return j;
            }
            else
            {
                
                rightsum=rightsum-j;
            }
        }
        return -1;
    }
}