class Solution {

    private boolean checkVowel(char ch)
    {
            if(ch == 'a' ||ch == 'e' ||ch == 'i' ||ch == 'o' ||ch == 'u' )
            {
                return true;
            }
            return false;
    }
    public int maxVowels(String s, int k) {
        int maxVowel = 0;
        int countVowels = 0;
        for(int i=0;i<k;i++)
        {
            if(checkVowel(s.charAt(i)))
            {
                countVowels++;
            }
        }

        maxVowel = countVowels;

        int i = k;

        while(i<s.length())
        {
            int before = (checkVowel(s.charAt(i-k)))? -1:0 ;
            int after = (checkVowel(s.charAt(i)))? 1:0 ;
            countVowels = countVowels + before  + after;
            maxVowel = Math.max(maxVowel, countVowels);
            i++;
        }

        return maxVowel;
    }
}