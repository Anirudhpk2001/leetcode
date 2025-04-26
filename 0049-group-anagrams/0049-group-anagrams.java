class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res=new ArrayList<>();

        HashMap<String,List<String>> map=new HashMap<>();

        for(int i=0;i<strs.length;i++)
        {
            char[] chars = strs[i].toCharArray();  
            Arrays.sort(chars);                   
            String sortedStr = new String(chars);
            map.computeIfAbsent(sortedStr,k->new ArrayList<>()).add(strs[i]);
        }


        for(Map.Entry<String,List<String>> e:map.entrySet())
        {
            res.add(e.getValue());
        }


        return res;
    }
}