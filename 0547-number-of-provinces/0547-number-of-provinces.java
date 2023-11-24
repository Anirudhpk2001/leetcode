class Solution {
    public void DFS(int vertex, int[][]isConnected,boolean[] Visited)
    {   
       
        for(int i=0;i<isConnected.length;i++)
        {
          
            if(Visited[i]==false && isConnected[vertex][i]==1)
            {
                Visited[i]=true;
                DFS(i,isConnected,Visited);
            }
        }
        

    }
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        boolean[] Visited =new boolean[n];
        int Prov=0;
        for(int i=0;i<n;i++)
        {
            if(Visited[i]==false)
            {
                 DFS(i,isConnected,Visited);
                 Prov+=1;
            }
            
        }
        return  Prov;      

    }
}