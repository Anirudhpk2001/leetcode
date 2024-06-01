class Solution {
    public int scoreOfString(String s) {
     
    int total_sum=0;
        for(int i=1;i<s.length();i++)
        {
            total_sum+=Math.abs(s.charAt(i)-s.charAt(i-1));
        }
        return total_sum;
    }
}