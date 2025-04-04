class Solution {
    public int earliestFullBloom(int[] plantTime, int[] growTime) {
        int[][] pair=new int[plantTime.length][2];

        for(int i=0;i<plantTime.length; i++)
        {
            pair[i][0]=growTime[i];
            pair[i][1]=plantTime[i];
        }

        Arrays.sort(pair,(a, b) -> b[0] - a[0]);

        int plant=0;
        int total=0;


        for(int[] p:pair)
        {
            plant+=p[1];

            total=Math.max(total,plant+p[0]);
        }


        return total;

    }
}