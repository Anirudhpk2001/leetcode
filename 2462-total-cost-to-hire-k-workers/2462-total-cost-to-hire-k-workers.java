class Solution {
    public long totalCost(int[] costs, int k, int candidates) {
        List<Integer> costarr= IntStream.of(costs).boxed().collect(Collectors.toList());
        PriorityQueue<Integer> firstmin=new PriorityQueue<>();
        PriorityQueue<Integer> secondmin=new PriorityQueue<>();
        long tcost=0;
        int left=0;
        int right=costs.length-1;
        for(int i=0;i<k;i++)
        {
            while(firstmin.size()<candidates && left<=right)
            {
              firstmin.add(costs[left]);
              left++;
            }
            while(secondmin.size()<candidates && right>=left)
            {
                secondmin.add(costs[right]);
                right--;
            }
            int minl=!firstmin.isEmpty()? firstmin.peek() : Integer.MAX_VALUE;
            int minR=!secondmin.isEmpty()? secondmin.peek() : Integer.MAX_VALUE;
            
            if(minl<=minR)
            {
                tcost+=firstmin.poll();
            }
            else
            {
                tcost+=secondmin.poll();
            }
         
               
        }
        
        return tcost;
    }
}