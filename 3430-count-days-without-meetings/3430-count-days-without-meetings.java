class Solution {
    public int countDays(int days, int[][] meetings) {


        Arrays.sort(meetings, (a, b) -> {
        if (a[0] != b[0]) {
            return Integer.compare(a[0], b[0]);
        }
        return Integer.compare(a[1], b[1]);
        });


        int result=0;
        int m=meetings.length;
        int n=2;

        System.out.println(Arrays.toString(meetings[0]));
        result+=meetings[0][0]-1;
        int high=meetings[0][1];
       


        for(int i=1;i<m;i++)
        {
            
            if(meetings[i][0]<=high+1)
            {
                if(meetings[i][1]>=high)
                {
                    high=meetings[i][1];
                }
            }
            else
            {
                result+=meetings[i][0]-(high+1);
                high=meetings[i][1];
            }
            
        }


        result+=days-high;

        return result;




    }
}