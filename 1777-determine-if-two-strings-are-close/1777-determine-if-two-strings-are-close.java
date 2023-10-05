import java.util.HashMap;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        if (word2.length() != word1.length()) {
            return false;
        }

        for (char c : word1.toCharArray()) {
            map1.put(c, map1.getOrDefault(c, 0) + 1);
        }

        for (char c : word2.toCharArray()) {
            if (!map1.containsKey(c)) {
                return false;  // Character sets are not the same
            }
            map2.put(c, map2.getOrDefault(c, 0) + 1);
        }

        // Check if the sets of characters are the same
        if (!map1.keySet().equals(map2.keySet())) {
            return false;
        }

        // Check if the frequencies are the same
        HashMap<Integer, Integer> freqCountMap1 = new HashMap<>();
        HashMap<Integer, Integer> freqCountMap2 = new HashMap<>();

        for (int freq : map1.values()) {
            freqCountMap1.put(freq, freqCountMap1.getOrDefault(freq, 0) + 1);
        }

        for (int freq : map2.values()) {
            freqCountMap2.put(freq, freqCountMap2.getOrDefault(freq, 0) + 1);
        }

        return freqCountMap1.equals(freqCountMap2);
    }
}
