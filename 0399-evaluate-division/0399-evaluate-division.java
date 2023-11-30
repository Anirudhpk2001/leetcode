class Solution {

    public void dfs(String start, String destination,HashMap<String, HashMap<String,Double>> graph,Set<String> Vis,double[] ans, double temp)
    {
        if(Vis.contains(start))
        {
            return;
        }
        Vis.add(start);
        if(start.equals(destination))
        {
            ans[0]=temp;
            return ;
        }
        for(Map.Entry<String,Double> entry:graph.get(start).entrySet())
        {
            String newnode=entry.getKey();
            double val=entry.getValue();
            dfs(newnode,destination,graph,Vis,ans,temp*val);
        }

    }


    public   HashMap<String, HashMap<String,Double>> CreateGraph(List<List<String>> equations , double[] values)
    {   HashMap<String, HashMap<String,Double>> hm=new HashMap<>();
        for(int i=0;i<equations.size();i++)
        {
            String dividend=equations.get(i).get(0);
            String divisor=equations.get(i).get(1);
            double value=values[i];
            hm.putIfAbsent(dividend,new HashMap<>());
            hm.putIfAbsent(divisor,new HashMap<>());
            hm.get(dividend).put(divisor,value);
            hm.get(divisor).put(dividend,1.0/value);
        }
        return hm;
    }


    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
       
       
       HashMap<String, HashMap<String,Double>>  hm=CreateGraph( equations , values) ;
       double[] result=new double[queries.size()];
     
       
       for(int i=0;i<queries.size();i++)
       {    
           
           String dividend=queries.get(i).get(0);
           String divisor=queries.get(i).get(1);
           if(!hm.containsKey(dividend)|| !hm.containsKey(divisor))
           {
               result[i]=-1.0;
             
           }
           else
           {
               Set<String> Vis=new HashSet<>();
                double[] ans={-1.0};
                double temp=1.0;
                dfs(dividend,divisor,hm,Vis,ans,temp);
                result[i]=ans[0];
            
           }
          
       }
       return result;


    }
}