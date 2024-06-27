class Solution {
    public int findCenter(int[][] edges) {
     // HashSet<Integer> set=new HashSet<>();
        int first_num=edges[0][0];
        int sec_num=edges[0][1];
        int ans=0;
        for(int i=1;i<edges.length;i++)
        {
            for(int j=0;j<edges[0].length;j++)
            {
               if(edges[i][j]==first_num)
               {
                   ans=first_num;
               }
                else if(edges[i][j]==sec_num)
                {
                    ans=sec_num;
                }
            }
        }
        return ans;
    }
}