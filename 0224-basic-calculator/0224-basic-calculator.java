class Solution {
    public int calculate(String s) {
        s.replaceAll("//s","");
        
        
        int number = 0;
        int result = 0;
        int sign = 1;
        Stack<Integer> st = new Stack<>();

        for(char ch:s.toCharArray())
        {
            if(Character.isDigit(ch))
            {
                number = number*10 + (ch-'0');
                
            }
            else if(ch== '+')
            {
                result+=sign*number;
                number = 0;
                sign = 1;
            }
            else if(ch == '-')
            {
                result+=sign*number;
                number = 0;
                sign = -1;
            }
            else if(ch == '(')
            {
                st.push(result);
                st.push(sign);
                result = 0;
                sign = 1;
                number = 0;
            }
            else if(ch == ')')
            {
                result += (number*sign);
                number = 0;
                result = st.pop()*result;
                result += st.pop();
                
               

            }
        }

        return result+(sign*number);
    }
}