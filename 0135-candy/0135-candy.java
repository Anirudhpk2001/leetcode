class Solution {
    public int candy(int[] ratings) {
        int[] answer = new int[ratings.length];
        Arrays.fill(answer,1);

        for(int i=1;i<ratings.length;i++)
        {
           if(ratings[i]>ratings[i-1])
           {
              answer[i] = 1+ Math.max(answer[i-1],answer[i]);
           } 
        }

        for(int i=ratings.length-2;i>=0;i--)
        {
            if(ratings[i] > ratings[i+1])
            {
                answer[i] = 1+ Math.max(answer[i+1],answer[i]);
            }
        }

        int totalCandies = 0;
        for(int ans : answer)
        {
            totalCandies+=ans;
        }

        return totalCandies;
    }
}