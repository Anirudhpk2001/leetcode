class Solution {
    public int candy(int[] ratings) {
        

        int count = 0;
        int[] candies = new int[ratings.length];
        Arrays.fill(candies,1);

        for(int i=1;i<ratings.length;i++)
        {
            if(ratings[i-1]<ratings[i])
            {
                candies[i] = candies[i-1]+1;
            }
        }

        for(int i=ratings.length-1;i>0;i--)
        {
            if(ratings[i]<ratings[i-1])
            {
                candies[i-1] = Math.max(candies[i]+1,candies[i-1]);
            }
            count+=candies[i-1];
        }

        return count+candies[ratings.length-1];
    }
}