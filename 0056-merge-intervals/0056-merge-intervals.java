class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b) -> Integer.compare(a[0],b[0]));

        ArrayList<int[]> result = new ArrayList<>();
        
        result.add(new int[]{intervals[0][0],intervals[0][1]});

        for(int i=1;i<intervals.length;i++)
        {
            
            int end1 = result.get(result.size()-1)[1];
            int start2 = intervals[i][0];
            int end2 = intervals[i][1];
            if(end1>= start2)
            {
                if(end1< end2)
                {
                    result.get(result.size()-1)[1] = end2;
                }
                else
                {
                    result.get(result.size()-1)[1] = end1;
                }
                
            }
            else
            {
                result.add(new int[] {start2,end2});
            }

        }

        return result.toArray(new int[result.size()][2]);
    }
}