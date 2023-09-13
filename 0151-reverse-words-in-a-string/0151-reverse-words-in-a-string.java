class Solution {
    public String reverseWords(String s) {
        String[] s1=s.split(" ");
        String res="";
        for(int i=s1.length-1;i>=0;i--)
        {
            String result = String.join(" ",s1[i] );
            res = res.trim() + " " + result.trim();
        }
        return res.trim();
    }
}