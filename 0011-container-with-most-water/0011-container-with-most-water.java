class Solution {
    public int maxArea(int[] height) {
        int i=0;
        int j=height.length-1;
        int maxarea=0;
        if(height.length==2)
        {
            return Math.min(height[0],height[1]);
        }
    

        while(i<j)
        {
           int max=Math.min(height[i],height[j])*(j-i);
           maxarea=Math.max(max,maxarea);
           
            if(height[i]<height[j])
           {    
               i++;
           }
        //    else if(height[j-1]>height[j]) 
        else
           {
               j--;
           }
          
        }
return maxarea;
    }
}