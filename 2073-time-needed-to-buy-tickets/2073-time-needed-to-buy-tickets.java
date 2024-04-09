class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        int count_sec=0;
        int i=0;
        while(tickets[k]>0)
        {   
            if(i==tickets.length)
            {
                i=0;
            }
         else {
                  if(tickets[i]>0 )
                {
                    count_sec++;
                    tickets[i]--;
                  
                } 
             i++;
            }
            
        }
        return count_sec;
    }
}