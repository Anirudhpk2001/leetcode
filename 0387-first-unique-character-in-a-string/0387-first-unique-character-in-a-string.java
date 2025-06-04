class Solution {
    public int firstUniqChar(String s) {
        HashMap<Character,ArrayList<Integer>> map =new HashMap<>();

        for(int i=0;i<s.length();i++)
        {
            map.computeIfAbsent(s.charAt(i),k -> new ArrayList<>()).add(i);
        }

        int result = Integer.MAX_VALUE;
        for(Map.Entry<Character,ArrayList<Integer>> e:map.entrySet())
        {
            if(e.getValue().size()==1)
            {
                result = Math.min(result,e.getValue().get(0));
            }
        }

        if(result == Integer.MAX_VALUE)
        {
            return -1;
        }

        return result;
    }
}