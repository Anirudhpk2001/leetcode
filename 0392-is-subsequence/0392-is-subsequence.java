class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.equals(t))
        {
            return true;
        }
        if(s.length() > t.length())
        {
            return false;
        }

        int j = 0;
        int i = 0;

        while(j<t.length())
        {
            if(i == s.length())
            {
                return true;
            }
            if(s.charAt(i) == t.charAt(j))
            {
                i++;
                j++;
            }
            else
            {
                j++;
            }
        }
            if(i == s.length())
            {
                return true;
            }

        return false;
    }
}