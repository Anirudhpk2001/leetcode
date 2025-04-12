class Solution {
    public int totalFruit(int[] fruits) {
        int left=0;
        int right=2;
        if(fruits.length<=2)
        {
            return fruits.length;
        }

        HashMap<Integer,Integer> map= new HashMap<>();
        map.put(fruits[0],0);
        map.put(fruits[1],1);


        
        int max=0;

        while(right<fruits.length)
        {
            if(map.size()==2 && !map.containsKey(fruits[right]))
            {
                max=Math.max(right-left,max);
              
                int k=-1;
                for(Map.Entry<Integer,Integer> e:map.entrySet())
                {
                    if(e.getKey()!=fruits[right-1])
                    {
                        left=e.getValue()+1;
                        k=e.getKey();
                    }

                }
                map.remove(k);
            }
            map.put(fruits[right],right);
            
            right++;
        }
        max=Math.max(right-left,max);
        return max;
    }
}