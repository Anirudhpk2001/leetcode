class Solution {
    public int characterReplacement(String s, int k) {
        //ABCC k =2
        int left = 0;
        int right = 0;
        int[] alphabet = new int[26];
        int max_count = 0;
        int result = 0;


        while(right<s.length())
        {
            alphabet[s.charAt(right) - 'A']++;

            max_count = Math.max(max_count,alphabet[s.charAt(right)-'A']);

            while(right - left + 1 - max_count > k)
            {
                alphabet[s.charAt(left) - 'A']--;
                left++;
            }

            result = Math.max(result,right-left+1);
            right++;

        }
        

        return result;
    }
}