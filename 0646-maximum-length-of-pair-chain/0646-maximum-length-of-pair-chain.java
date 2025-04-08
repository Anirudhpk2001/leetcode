class Solution {
    public int findLongestChain(int[][] pairs) {
        Arrays.sort(pairs,Comparator.comparingInt(a -> a[0]));
        int t[]=new int[pairs.length];

        Arrays.fill(t,1);
        int max=1;

        for(int i=1;i<pairs.length;i++)
        {
            for(int j=0;j<i;j++)
            {
                if(pairs[i][0]> pairs[j][1])
                {
                     t[i]=Math.max(t[i],t[j]+1);
                }
               
              
            }
            max=Math.max(max,t[i]);
        }


        return max;
    }
}