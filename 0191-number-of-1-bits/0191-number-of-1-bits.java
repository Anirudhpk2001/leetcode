class Solution {
    public int hammingWeight(int n) {
        int bitCount=0;

        for(int i=0;i<=31;i++)
        {
            if(((n>>i)&1)!=0)
            {
                bitCount++;
            }
        }
        return bitCount;
    }
}