class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        HashMap<Integer,ArrayList<Integer>> adj = new HashMap<>();
        int[] indegree = new int[numCourses];
        Arrays.fill(indegree,0);
        Queue<Integer> q = new LinkedList<>();

        for(int i=0;i<prerequisites.length;i++)
        {
            
            adj.computeIfAbsent(prerequisites[i][1],k -> new ArrayList<>()).add(prerequisites[i][0]);
            indegree[prerequisites[i][0]]++;

        }

        for(int i=0;i<indegree.length;i++)
        {
            if(indegree[i]==0)
            {
                q.add(i);
            }
        }
        int count = 0;

        while(!q.isEmpty())
        {
            int source = q.poll();
            count++;

            if(adj.containsKey(source))
            {
                for(int v:adj.get(source))
                {
                    indegree[v]--;
                    if(indegree[v] == 0)
                    {
                        q.add(v);
                    }
                }
            }
        }
        
        return count == numCourses;


    }
}