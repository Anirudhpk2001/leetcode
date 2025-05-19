class Solution {
    public int nthUglyNumber(int n) {
        
        int i2=1;
        int i3=1;
        int i5=1;
        int t[]=new int[n+1];
        t[1]=1;

        for(int i=2;i<=n;i++)
        {
            int i2un=t[i2]*2;
            int i3un=t[i3]*3;
            int i5un=t[i5]*5;

            int min=Math.min(i2un,Math.min(i3un,i5un));
            t[i]=min;
            if(min==i2un)
            {
                i2++;
            }
            if(min==i3un)
            {
                i3++;
            }
            if(min==i5un)
            {
                i5++;
            }
        }

        return t[n];
    }
}