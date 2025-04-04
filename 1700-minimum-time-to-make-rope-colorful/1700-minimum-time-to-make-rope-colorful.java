class Solution {
    public int minCost(String colors, int[] neededTime) {
        int time=0;
        int prevmax=0;

        for(int i=0;i<neededTime.length;i++)
        {
            if(i>0 && colors.charAt(i)!= colors.charAt(i-1 ))
            {
                prevmax=0;
            }

            time+=Math.min(prevmax,neededTime[i]);
            prevmax=Math.max(prevmax,neededTime[i]);
        }

        return time;
       
    }
}