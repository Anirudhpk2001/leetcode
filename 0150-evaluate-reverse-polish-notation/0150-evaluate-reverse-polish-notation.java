class Solution {
    public int evalRPN(String[] tokens) {
        if(tokens.length==1 && !tokens[0].matches("[\\+\\-\\*/]"))
        {
            return Integer.valueOf(tokens[0]);
        }
        Stack<Integer> st =new Stack<>();
        int i=0;
        for(String token :tokens)
        {
            if(token.equals("+") )
            {   
                st.push(st.pop()+st.pop());
            }
            else if(token.equals("-") )
            {   
                int num1=st.pop();
                int num2=st.pop(); 
                st.push(num2-num1);
            }
            else if(token.equals("*") )
            {   
                st.push(st.pop()*st.pop());
            }
            else if(token.equals("/") )
            {   
                int num1=st.pop();
                int num2=st.pop(); 
                st.push(num2/num1);
            }
            else
            {
                
                st.push(Integer.parseInt(token));
            }
          System.out.println(st.peek());
        }
    return st.peek();

    }
}