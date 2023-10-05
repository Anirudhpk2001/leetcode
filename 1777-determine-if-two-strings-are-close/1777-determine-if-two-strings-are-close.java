class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
        if(word1.length()!=word2.length())
        {
            return false;
        }

        for(char  c:word1.toCharArray())
        {
            map1.put(c,map1.getOrDefault(c,0)+1);
        }

        for(char  c:word2.toCharArray())
        {   
            if(!map1.containsKey(c))
            {
                return false;
            }
            map2.put(c,map2.getOrDefault(c,0)+1);
        }

        HashMap<Integer,Integer> hm1=new HashMap<>();
        HashMap<Integer,Integer> hm2=new HashMap<>();

        for(int freq:map1.values())
        {
            hm1.put(freq,hm1.getOrDefault(freq,0)+1);
        }
        for(int freq:map2.values())
        {
            hm2.put(freq,hm2.getOrDefault(freq,0)+1);
        }

        return hm1.equals(hm2);

        
    }
}