class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int[] alphabet = new int[26];

        for(char ch:s1.toCharArray())
        {
            alphabet[ch-'a']++;
        } 

        int count = s1.length();
        int left = 0;
        int right = 0;

        while(right<s2.length())
        {
            char ch = s2.charAt(right);
            if(alphabet[ch-'a']>0)
            {
                count--;
            }

            alphabet[ch-'a']--;
            if(count == 0)
            {
                return true;
            }

            while(right - left +1 == s1.length())
            {
                char leftChar = s2.charAt(left);
                if(alphabet[leftChar - 'a']>=0)
                {
                    count++;
                }
                alphabet[leftChar - 'a']++;
                left++;
            }

            right++;
        }

        return false;
    }
}