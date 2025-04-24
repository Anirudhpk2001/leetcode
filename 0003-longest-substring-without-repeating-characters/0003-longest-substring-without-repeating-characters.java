class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashSet<Character> set=new HashSet<>();

        int left=0;
        int right=0;
        int longest_sub=0;
        for(right=0;right<s.length();right++)
        {
            if(!set.contains(s.charAt(right)))
            {
                set.add(s.charAt(right));
                longest_sub=Math.max(longest_sub,right-left+1);
            }
            else
            {
                while(set.contains(s.charAt(right)))
                {
                    set.remove(s.charAt(left));
                    left++;
                }
                set.add(s.charAt(right));
            }
        }


        return longest_sub;



    }
}