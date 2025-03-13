class Solution {
    public boolean isPowerOfFour(int n) {
        int count=-1;
        if(n==0)
        {
            return false;
        }
        if(Integer.bitCount(n)>1)
        {
            return false;
        }
        while(n>0)
        {
            n>>=1;
            count++;
        }
        
       if(count%2==0)
       {
        return true;
       }

       return false;
    }
}