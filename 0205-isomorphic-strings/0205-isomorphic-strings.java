class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character,Character> maps=new HashMap<>();
        HashMap<Character,Character> mapt=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(!maps.isEmpty() && !mapt.isEmpty())
            {
                if(maps.containsKey(s.charAt(i)))
                {
                    if(maps.get(s.charAt(i))!=t.charAt(i))
                {
                   return false;
                }
                }
               if(mapt.containsKey(t.charAt(i)))
               {
                   if(mapt.get(t.charAt(i))!=s.charAt(i))
                {
                    return false;
                }
                }
                
            }
            maps.put(s.charAt(i),t.charAt(i));
            mapt.put(t.charAt(i),s.charAt(i));
        }
        return true;
    }
}