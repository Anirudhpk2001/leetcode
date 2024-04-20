class Solution {
      ArrayList<ArrayList<Integer>> land_form=new ArrayList<>();
    
    public void DFS(int[][] land, int i,int j,ArrayList<Integer> temp)
    {
        if(i<0 || j<0 || i>=land.length || j>=land[0].length || land[i][j]!=1)
        {
            return;
        }
        
        
            temp.set(2,Math.max(temp.get(2),i));
            temp.set(3,Math.max(temp.get(3),j));
            land[i][j]=0;
        
        
             

        DFS(land,i-1,j,temp);
         DFS(land,i+1,j,temp);
         DFS(land,i,j-1,temp);
         DFS(land,i,j+1,temp);
    }
    
    public int[][] findFarmland(int[][] land) {
      
        
        for(int i=0;i<land.length;i++)
        {
            for(int j=0;j<land[0].length;j++)
            {
                if(land[i][j]==1)
                {   
                    ArrayList<Integer> temp=new ArrayList<>();
                    temp.add(i);
                    temp.add(j);
                    temp.add(i);
                    temp.add(j);
                    DFS(land,i,j,temp);
                    land_form.add(temp);
                }
            }
        }
        
    int[][] arr=new int[land_form.size()][4];
    for(int i=0;i<land_form.size();i++)
    {
        ArrayList<Integer> temp = land_form.get(i);
            for (int j = 0; j < 4; j++) {
                arr[i][j] = temp.get(j);
            }
        }
        
        return arr;
    }
}