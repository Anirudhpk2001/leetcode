import java.util.Collection;

class Solution {
    public boolean closeStrings(String word1, String word2) {
        HashMap<Character,Integer> map1=new HashMap<>();
        HashMap<Character,Integer> map2=new HashMap<>();
         

        if(word2.length()!=word1.length())
        {
            return false;
        }
        for(int i=0;i<word1.length();i++)
        { if(map1.containsKey(word1.charAt(i)))
            {
                map1.put(word1.charAt(i),map1.get(word1.charAt(i))+1);
            }
            else{
                map1.put(word1.charAt(i),1);
            }
            if(map2.containsKey(word2.charAt(i)))
            {
                map2.put(word2.charAt(i),map2.get(word2.charAt(i))+1); 
            }
            else{
                map2.put(word2.charAt(i),1);
            }
        }
        for(int i=0;i<word1.length();i++)
        {
            if(!map2.containsKey(word1.charAt(i)))
            {
                return false;
            }
            if(!map1.containsKey(word2.charAt(i)))
            {
                return false;
            }
        }
        // for(int n : map1.values())
        // {
        //     if(!map2.containsValue(n))
        //     {
        //         return false;
        //     }
        // }


        // for(int k : map2.values())
        // {
        //     if(!map1.containsValue(k))
        //     {
        //         return false;
        //     }
        // }  
         Collection<Integer> values1 = map1.values();
         Collection<Integer>  values2=map2.values();
  
        ArrayList<Integer> listOfValues1 = new ArrayList<>(values1);
        ArrayList<Integer> listOfValues2=new ArrayList<>(values2);
        Collections.sort(listOfValues1);
        Collections.sort(listOfValues2);

        if(!listOfValues1.equals(listOfValues2))
        {
            return false;
        }


        return true;
    }
}