class Solution {
    public int lengthOfLastWord(String s) {
        String trimmedStr = s.replaceAll("\\s+", " ");
        String[] words = trimmedStr.split(" ");
        String lastWord = words[words.length -1];
        return lastWord.length();
        
    }
}