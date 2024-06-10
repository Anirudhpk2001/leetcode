class Solution {
    public int heightChecker(int[] heights) {
        // int max=0;
        // for(int num:heights)
        // {
        //    if(num>=max)
        //    {
        //        max=num;
        //     }
        // }
        int[] expected=new int[101];
        
        for(int i=0;i<heights.length;i++)
        {
            expected[heights[i]]++;
        }
        int sorted_arr[]=new int[heights.length];
        int k=0;
        for(int i=0;i<expected.length;i++)
        {
            if(expected[i]>0)
            {
                while(expected[i]>0)
                {
                    sorted_arr[k]=i;
                    k++;
                    expected[i]--;
                }
            }
        }
        int change=0;
        for(int i=0;i<sorted_arr.length;i++)
        {
          if(heights[i]!=sorted_arr[i])
          {
              change++;
          }
        }
        return change;
    }
}