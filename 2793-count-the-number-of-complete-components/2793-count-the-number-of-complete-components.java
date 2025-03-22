class Solution {

    public int dfs( HashMap<Integer, List<Integer>> adj,boolean[] visited,int u,ArrayList<Integer> node)
    {
        visited[u]=true;
        node.add(u);
        int count=0;
        if(adj.containsKey(u))
        {
            for(int v:adj.get(u))
            {
            
                if (!visited[v]) {
                    count+=dfs(adj,visited,v,node);
                }
                count++;
            }
        }
        return count;
    }

    public int countCompleteComponents(int n, int[][] edges) {
        boolean[] visited=new boolean[n];
        Arrays.fill(visited,false);
        int numEdges[]=new int[n+1];

        HashMap<Integer, List<Integer>> adj=new HashMap<>();

        for(int[] edge:edges)
        {
            adj.computeIfAbsent(edge[0], k -> new ArrayList<>()).add(edge[1]);
            adj.computeIfAbsent(edge[1], k -> new ArrayList<>()).add(edge[0]);
        }
         ArrayList<Integer> node;
        int connComp=0;

        for(int i=0;i<n;i++)
        {
            if(visited[i]!=true)
            {
               node=new ArrayList<>();
                int edgecount=dfs(adj,visited,i,node);
                int nodecount=node.size();
                if(nodecount*(nodecount-1)==edgecount)
                {
                    connComp++;
                }
               
            }
            
        }

        return connComp;



    }
}