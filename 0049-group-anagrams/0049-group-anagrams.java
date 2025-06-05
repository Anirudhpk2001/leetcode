class Solution {

    private String sort(String str)
    {
        char[] arr = str.toCharArray();

        Arrays.sort(arr);

        return new String(arr);
    }
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String,List<String>> Anagrams = new HashMap<>();

        if(strs.length == 0 )
        {
            return result;
        }
        for(String str:strs)
        {
            Anagrams.computeIfAbsent(sort(str),k -> new ArrayList<>()).add(str);
        }

        for(Map.Entry<String,List<String>> e : Anagrams.entrySet())
        {
            result.add(e.getValue());
        }

        return result;

    }
}