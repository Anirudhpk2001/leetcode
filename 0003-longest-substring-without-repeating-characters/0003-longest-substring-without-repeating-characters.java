class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();
        int i = 0;
        int j = 1;
        int longest_substring = 1;

        if(s.length() == 0)
        {
            return 0;
        }

        set.add(s.charAt(0));

        while(j<s.length())
        {
            if(set.contains(s.charAt(j)))
            {
                while(set.contains(s.charAt(j)))
                {
                    set.remove(s.charAt(i));
                    i++;
                }
                set.add(s.charAt(j));
                j++;
            }
            else
            {
                longest_substring = Math.max(longest_substring,j-i+1);
                set.add(s.charAt(j));
                j++;
            }
        }

        return longest_substring;
    }
}