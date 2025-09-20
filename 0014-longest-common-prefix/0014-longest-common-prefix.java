class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder prefix = new StringBuilder(strs[0]);

        for(int i=0;i<strs.length;i++)
        {
            while(!strs[i].startsWith(prefix.toString()))
            {
                prefix = new StringBuilder(prefix.substring(0,prefix.length()-1));
                if(prefix.isEmpty())
                {
                    return "";
                }
            }
        }

        return prefix.toString();
    }
}