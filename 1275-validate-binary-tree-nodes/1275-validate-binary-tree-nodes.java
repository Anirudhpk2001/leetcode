class Solution {
   
    public boolean validateBinaryTreeNodes(int n, int[] leftChild, int[] rightChild) {
         HashMap<Integer,Integer> map=new HashMap<>();
         HashMap<Integer,List<Integer>> adj=new HashMap<>();


        for(int i=0;i<n;i++)
        {
           
            if(leftChild[i]!=-1)
            {
                adj.computeIfAbsent(i,k -> new ArrayList<>()).add(leftChild[i]);
                if(map.containsKey(leftChild[i]) && map.get(leftChild[i])!=i)
                {
                    return false;
                }
                map.put(leftChild[i],i);
            }
            if(rightChild[i]!=-1)
            {
                adj.computeIfAbsent(i,k -> new ArrayList<>()).add(rightChild[i]);
                 if(map.containsKey(rightChild[i]) && map.get(rightChild[i])!=i)
                {
                    return false;
                }
                map.put(rightChild[i],i);
            }
        }

        int root=-1;

        for(int i=0;i<n;i++)
        {
            if(!map.containsKey(i))
            {
                if(root!=-1)
                {
                    return false;
                }
                root=i;
            }
        }


        if(root==-1)
        {
            return false;
        }

        Queue<Integer> queue=new LinkedList<>();
        int count=0;
        int[] visited=new int[n+1];
        Arrays.fill(visited,0);
        visited[root]=1;
        queue.add(root);

        while(!queue.isEmpty())
        {
            int u=queue.poll();
            count++;
            if(adj.containsKey(u))
            {
                for(int v:adj.get(u))
                    {
                        if(visited[v]==1)
                        {
                            return false;
                        }
                        queue.add(v);
                        visited[v]=1;
                    }
            }
            
        }

        if(count!=n)
        {
            return false;
        }


        return true;
    }
}