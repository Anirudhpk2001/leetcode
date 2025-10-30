class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();


        if(t.length() > s.length())
        {
            return "";
        }

        for(char ch:t.toCharArray())
        {
            map.put(ch,map.getOrDefault(ch,0)+1);
        }

        int required_size = t.length();

        int i = 0;
        int j= 0;
        int start_index = 0;
        int min_window = Integer.MAX_VALUE;

        while(j<s.length())
        {
            if(map.containsKey(s.charAt(j)) && map.get(s.charAt(j))>0)
            {
                required_size--;
            }
            map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)-1);

            while(required_size == 0)
            {
                if(min_window > j-i+1)
                {
                    min_window = Math.min(min_window,j-i+1);
                    start_index = i;
                }

                map.put(s.charAt(i),map.getOrDefault(s.charAt(i),0)+1);

                if(map.get(s.charAt(i))>0)
                {
                    required_size++;
                }

                i++;

                
            }

            j++;

        }

        return (min_window == Integer.MAX_VALUE) ? "" : s.substring(start_index,start_index+min_window);
    }
}