class Solution {
    int[][] dp;
    private int recursion(String word1, String word2,int i,int j)
    {
        if(i== word1.length())
        {
            return word2.length()-j;
        }

        if(j == word2.length())
        {
            return word1.length()-i;
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }

        if( word1.charAt(i) == word2.charAt(j))
        {
           return recursion(word1,word2,i+1,j+1);
        } 
       
            int insert = 1+ recursion(word1,word2,i,j+1);
            int delete = 1+ recursion(word1,word2,i+1,j);
            int replace = 1+ recursion(word1,word2,i+1,j+1);

        

        return dp[i][j] = Math.min(insert,Math.min(delete,replace));
        


    }
    public int minDistance(String word1, String word2) {
        dp = new int[word1.length()][word2.length()];

        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
        
        return recursion( word1, word2,0,0);
    }
}