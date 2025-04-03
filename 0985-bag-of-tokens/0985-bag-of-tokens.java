class Solution {
    public int bagOfTokensScore(int[] tokens, int power) {
        Arrays.sort(tokens);
        int max=0;
        int i=0;
        int j=tokens.length-1;
        int count=0;
        while(i<=j)
        {
            if(tokens[i]<=power)
            {
                count++;
                power-=tokens[i];
                i++;
            }
            else if(tokens[i]>power && count>0)
            {
                power+=tokens[j];
                j--;
                count--;
            }
            else
            {
                break;
            }

            max=Math.max(max,count);
        }


        return max;
    }
}