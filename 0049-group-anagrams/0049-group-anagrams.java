class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,ArrayList<String>> anagrams = new HashMap<>();
        List<List<String>> result = new ArrayList<>();
        for(String str: strs)
        {
            char[] ch = str.toCharArray();
            Arrays.sort(ch);
            anagrams.computeIfAbsent(new String(ch),k -> new ArrayList<>()).add(str);
        }

        for(ArrayList<String> val : anagrams.values() )
        {
            result.add(val);
        }

        return result;

    }
}