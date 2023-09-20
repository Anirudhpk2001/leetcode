class Solution {
    public int largestAltitude(int[] gain) {
        int[] gain1=new int[gain.length+1];
        int max=0;
        gain1[0]=0;
        for(int i=1;i<gain1.length;i++)
        {
            gain1[i]=gain[i-1]+gain1[i-1];
            max=Math.max(max,gain1[i]);
        }
        return max;
    }
}