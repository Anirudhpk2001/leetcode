class Solution {
    public int equalPairs(int[][] grid) {
    
   
    HashMap<String,Integer> hm=new HashMap<>();
     for(int i=0;i<grid[0].length;i++)
     {  String rowsum="";
         for(int j=0;j<grid.length;j++)
         {
             rowsum+= String.valueOf(grid[i][j])+'_';
         }
         hm.put(rowsum,hm.getOrDefault(rowsum,0)+1);
     }
     int count=0;
     for(int i=0;i<grid[0].length;i++)
     {   String colsum="";
         for(int j=0;j<grid.length;j++)
         {
             colsum+=String.valueOf(grid[j][i])+'_';
         }
         if(hm.containsKey(colsum))
         {
            count+=hm.get(colsum);
         }
         
     }

     return count;
    }
}