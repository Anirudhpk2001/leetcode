class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        StringBuilder result = new StringBuilder();
        String s1 = strs[0];
        String s2 = strs[strs.length-1];

        int i = 0;
        while(i<s1.length() && i<s2.length())
        {
            if(s1.charAt(i) == s2.charAt(i))
            {
                result.append(s1.charAt(i));
                i++;
            }
            else
            {
                break;
            }
        }

        return result.toString();
    }
}