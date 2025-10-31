class Solution {
    public boolean isAnagram(String s, String t) {
        char[] sorted_s = s.toCharArray();
        Arrays.sort(sorted_s);
        char[] sorted_t = t.toCharArray();
        Arrays.sort(sorted_t);
        return Arrays.equals(sorted_s,sorted_t);
    }
}