public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {

    String s = Integer.toBinaryString(n);
       int len = s.length();
       while(len < 32){
         s = '0'+s;
         len++;
       }
       StringBuilder sb = new StringBuilder(s);
       sb.reverse();
       return (int)Long.parseLong(sb.toString(),2);
    }
}