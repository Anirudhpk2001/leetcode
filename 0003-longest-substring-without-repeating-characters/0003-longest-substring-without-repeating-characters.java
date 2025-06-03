class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set = new HashSet<>();

        int i=0;
        int j=1;
        if(s.length()==0)
        {
            return 0;
        }
        set.add(s.charAt(0));

        int maxLength= 1;

        while(i<s.length() && j<s.length())
        {
            if( !set.contains(s.charAt(j)))
            {
                set.add(s.charAt(j));
                maxLength = Math.max(maxLength,set.size());
            }

            else
            {
                
                while(set.contains(s.charAt(j)))
                {
                    set.remove(s.charAt(i));
                    i++;
                }
                set.add(s.charAt(j));
            }
            j++;
        }


        return maxLength;
    }
}