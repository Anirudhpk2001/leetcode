class Solution {
    public int maxPower(String s) {
        int i = 0;
        int j = 0;
        int max = 0;
        while(i<s.length() && j<s.length()){
            
            while(j<s.length()  && s.charAt(i)==s.charAt(j))
            {
                j++;
            }
            
            max = Math.max(max,j-i);
            i=j;
        }

        return max;
    }
}