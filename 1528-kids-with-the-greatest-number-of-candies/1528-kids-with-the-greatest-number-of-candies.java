class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int max=0;
        ArrayList<Boolean> arr=new ArrayList<>();
        for(int i=0;i<candies.length;i++)
        {   if(max<candies[i])
            max=candies[i];
        }

        for(int j=0;j<candies.length;j++)
        {
            if(candies[j]+extraCandies>=max)
            {
                arr.add(true);
            }
            else
            {
                arr.add(false);
            }
        }
        return arr;
    }
}