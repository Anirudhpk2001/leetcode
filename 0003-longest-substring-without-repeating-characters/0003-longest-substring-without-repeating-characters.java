class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character,Integer> map=new HashMap<>();

        int left=0;
        int right=0;
        int longest_sub=0;

        if(s.length()==0)
        {
            return 0;
        }
        while( right<s.length())
        {
            if(map.isEmpty() || !map.containsKey(s.charAt(right)))
            {
                map.put(s.charAt(right),right);
                right++;
            }

            if(right <s.length() && map.containsKey(s.charAt(right)))
            {
                longest_sub=Math.max(map.size(),longest_sub);
                left=map.get(s.charAt(right))+1;
                right=left;
                map.clear();

            }


        } 

        longest_sub=Math.max(map.size(),longest_sub);

        return longest_sub;
    }
}