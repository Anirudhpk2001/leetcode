class Solution {
    public int numberOfSpecialChars(String word) {
        HashSet<Character> set = new HashSet<>();
        int total = 0;
        for(char c:word.toCharArray())
        {
            set.add(c);
        }

         for(char c:word.toCharArray())
        {
            if(Character.isLowerCase((c)))
            {
                if(set.contains(Character.toUpperCase(c)))
                {
                    total+=1;
                    set.remove(Character.toUpperCase(c));
                }
            }
        }

        return total;

        
    }
}