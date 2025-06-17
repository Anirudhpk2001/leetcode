class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        int i=0;
        
        while(i<s.length())
        {
            if(s.charAt(i) == ')')
            {
                if(st.size()>=1 && st.peek() == '(')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
            else if(s.charAt(i) == ']')
            {
                if(st.size()>=1 && st.peek() == '[')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
            else if(s.charAt(i) == '}')
            {
                if(st.size()>=1 && st.peek() == '{')
                {
                    st.pop();
                }
                else
                {
                    return false;
                }
            }
            else
            {
                st.push(s.charAt(i));
            }
            i++;
        }

        if(st.size() != 0)
        {
            return false;
        }
       

        return true;

    }
}