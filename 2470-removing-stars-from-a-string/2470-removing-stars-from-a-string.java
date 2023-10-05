class Solution {
    public String removeStars(String s) {
       Stack<Character> st=new Stack<>();
       String s1="";
       StringBuilder result = new StringBuilder();
       
       for(char ch:s.toCharArray())
       {      st.push(ch);
           if(ch=='*')
           {   
               
              st.pop();
              st.pop(); 
           }
           
         
       }
       if(st.isEmpty())
                {
                    return "";
                 }
       for (char element : st) {
        result.append(element);
            }

        return result.toString();
    }
}