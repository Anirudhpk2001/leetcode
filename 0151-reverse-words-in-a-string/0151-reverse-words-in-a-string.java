class Solution {
    public String reverseWords(String s) {

        String trimmedString= s.trim().replaceAll("\\s+"," ");
        String[] words = trimmedString.split(" ");
        
        int start = 0;
        int end = words.length-1;

        while(start<end)
        {
            String temp = words[start];
            words[start] = words[end];
            words[end] = temp;
            start++;
            end--;
        }

        StringBuilder res = new StringBuilder();

        for(int i=0;i<words.length;i++)
        {
            
            if(i!=0)
            {
                res.append(" ");
            }
            res.append(words[i]);
        }


        return res.toString();
 
    }
}