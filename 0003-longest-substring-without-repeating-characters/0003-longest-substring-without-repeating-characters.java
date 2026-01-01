class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max_length = 0;
        if(s.length() == 0)
        {
            return 0;
        }

        int left = 0;
        int right = 0;
        HashSet<Character> set = new HashSet<>();

        while(right < s.length())
        {
            if(set.contains(s.charAt(right)))
            {
                 while(set.contains(s.charAt(right)))
                {
                    set.remove(s.charAt(left));
                    left++;
                }
               
            }
            
            set.add(s.charAt(right));
            max_length = Math.max(max_length,right-left+1);
            right++;
            
        }
        


        return max_length;
    }
}