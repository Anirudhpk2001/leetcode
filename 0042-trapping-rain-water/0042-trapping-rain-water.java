class Solution {
    public int trap(int[] height) {
        int[] right_max = new int[height.length];
        int[] left_max = new int[height.length];

        left_max[0]=height[0];
        right_max[height.length-1]=height[height.length-1];
        int n = height.length-1;
        for(int i = 1 ;i < height.length ; i++)
        {
            left_max[i] = Math.max(left_max[i-1],height[i]);
            right_max[n-i] = Math.max(right_max[n-i+1],height[n-i]);
        }

        // System.out.println(right_max[0]);
        // System.out.println(left_max[n]);
        int trapped_water=0;
        for(int i=0;i<height.length;i++)
        {
            trapped_water+=Math.min(left_max[i],right_max[i]) - height[i];
        }

        return trapped_water;


    }
}