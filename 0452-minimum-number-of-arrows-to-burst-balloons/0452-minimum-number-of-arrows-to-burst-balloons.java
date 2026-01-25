class Solution {
    public int findMinArrowShots(int[][] points) {
        Arrays.sort(points,Comparator.comparingInt(a -> a[0]));
        int arrows =0;
        int prev = points[0][1];
        for(int[] point : points)
        {
            if(prev < point[0])
            {
                arrows++;
                prev = point[1];
            }
            else
            {
                if(prev > point[1])
                {
                    prev = point[1];
                }
            }
        }

        return arrows+1;
    }
}