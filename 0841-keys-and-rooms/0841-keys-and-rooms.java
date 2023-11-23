class Solution {
    
    public void DFS(int vertex,boolean VisitedRoom[],List<List<Integer>> rooms)
    {
        
        VisitedRoom[vertex]=true;
        
        Iterator<Integer> ite = rooms.get(vertex).listIterator();
         while (ite.hasNext()) {
            int adj = ite.next();
            if (!VisitedRoom[adj])
             DFS(adj,VisitedRoom,rooms);
         }
        // for(int i : rooms.get(vertex))
        // {
        //     if(!VisitedRoom(i))
        //     {
        //         DFS(i,VisitedRoom,rooms);
        //     }
        // }
        
        
    }
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        int Numrooms=rooms.size();
        boolean[] VisitedRoom=new boolean[Numrooms];
        // Arrays.fill(VisitedRoom,0);
        DFS(0,VisitedRoom,rooms);
        for(boolean i:VisitedRoom)
        {
            if(i==false)
            {
                return false;
                
            }
        }
        return true;
    }
}