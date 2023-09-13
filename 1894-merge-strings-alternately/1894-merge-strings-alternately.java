class Solution {
    public String mergeAlternately(String word1, String word2) {
        int m=word1.length();
        int n=word2.length();
        String res="";
        int i=0;
        int j=0;

        while(i<m && j<n)
        {
            res+=word1.charAt(i++);
            res+=word2.charAt(j++);
        } 
        while(i<m)
        {
            res+=word1.charAt(i++);
        }
        while(j<n)
        {
            res+=word2.charAt(j++);
        }

        return res;


    }
}