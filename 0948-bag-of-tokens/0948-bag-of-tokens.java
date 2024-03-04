class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int score=0;
        int i=0;
        int j=tokens.length-1;
        int MaxScore=0;
        
       while(i<=j)
        {
           if(tokens[i]<=power )
           {
                power=power-tokens[i];
               i++;
               score=score+1;
             
           }
           else if(score>0)
           {
                power=power+tokens[j];
               j--;
               score=score-1;
            }
           else
           {
               break;
            }
           MaxScore=Math.max(MaxScore,score);
            
        }
        return MaxScore;
    }
}