class Solution {
    public List<String> findAllRecipes(String[] recipes, List<List<String>> ingredients, String[] supplies) {
        HashMap<String,List<String>> adj=new HashMap<>();
        HashMap<String,Integer> indegree=new HashMap<>();
        HashSet<String> recipeset=new HashSet<>();
        HashSet<String> supplySet=new HashSet<>();
        List<String> result=new ArrayList<>();

        for(int i=0;i<recipes.length;i++)
        {
            for(String in:ingredients.get(i))
            {
                adj.computeIfAbsent(in,k -> new ArrayList<>()).add(recipes[i]);
                indegree.put(recipes[i],indegree.getOrDefault(recipes[i],0)+1);
                indegree.put(in,indegree.getOrDefault(in,0));
                recipeset.add(recipes[i]);
            }
        }
        Queue<String> q=new LinkedList<>();

        for(String supply:supplies)
        {
            supplySet.add(supply);
        }

        for (Map.Entry<String, Integer> entry : indegree.entrySet()) {
            String key = entry.getKey();
            int value = entry.getValue();

            if(value==0 && supplySet.contains(key))
            {
                q.add(key);
            }
        
        }

        while(!q.isEmpty())
        {
            String ingre=q.poll();

            if(recipeset.contains(ingre)  )
            {
                result.add(ingre);
            }
            if(adj.containsKey(ingre))
            {
            for(String v:adj.get(ingre))
            {
                indegree.put(v,indegree.getOrDefault(v,0)-1);
                if(indegree.get(v)==0)
                {
                    q.add(v);
                }
            }
            }
        }
        
        return result;
    }
}