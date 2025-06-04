class Solution {
    public String convert(String s, int numRows) {
        if(numRows == 1)
        {
            return s;
        }

        List<List<Character>> result = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            result.add(new ArrayList<>());
        }
        boolean flag = true;
        int j = 0;

        for(int i=0;i<s.length();i++)
        {
            if(flag)
            {
                result.get(j).add(s.charAt(i));
                j++;
            }
            else
            {
                result.get(j).add(s.charAt(i));
                j--;
            }

            if(j == 0)
            {
                flag = true;
                
            }

            if(j == numRows -1)
            {
                flag = false;
               
            }
            
        }
        StringBuilder res = new StringBuilder();
        for(List<Character> list: result)
        {
            for(char ch : list)
            {
                res.append(ch);
            }
        }

        



        return res.toString();
    }
}