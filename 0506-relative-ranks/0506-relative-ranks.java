class Solution {
    public String[] findRelativeRanks(int[] score) {
        HashMap<Integer,Integer> hm=new HashMap<>();
        String[] res=new String[score.length];
        for(int i=0;i<score.length;i++)
        {
            hm.put(score[i],i);
        }
        
        PriorityQueue<Integer> pq=new PriorityQueue<>(Collections.reverseOrder());
        
        for(int num:score)
        {
            pq.add(num);
        }
        int i=0;
        while(!pq.isEmpty())
        {
            if(i==0)
            {
                res[hm.get(pq.remove())]="Gold Medal";
            }
            else if(i==1)
            {
                res[hm.get(pq.remove())]="Silver Medal";
            }
            else if(i==2)
            {
                res[hm.get(pq.remove())]="Bronze Medal";
            }
            else
            {   int temp=i+1;
                res[hm.get(pq.remove())]=Integer.toString(temp);;
            }
            
            i++;
           
            
        }
        return res;
    }
}