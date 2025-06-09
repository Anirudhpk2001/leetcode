class Solution {
    public boolean checkIfPangram(String sentence) {
        
        int[] alphabets = new int[26];

        for(char ch : sentence.toCharArray())
        {
            alphabets[ch-'a']++;
        }
        int count =0;
        for(int num:alphabets)
        {
            if(num < 1)
            {
                return false;
            }
            else
            {
                count++;
            }
        }

        if(count >= 26)
        {
            return true;
        }

        return false;
    }
}