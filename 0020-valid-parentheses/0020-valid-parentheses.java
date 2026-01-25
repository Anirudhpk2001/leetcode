class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        int right = 0;

        while(right<s.length())
        {
            if(s.charAt(right) == '(' || s.charAt(right) == '{' || s.charAt(right) == '[')
            {
                st.push(s.charAt(right));
            }
            else
            {
                if(s.charAt(right) == ')')
                {
                    if(!st.isEmpty() && st.peek() == '(')
                    {
                        st.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else if(s.charAt(right) == '}')
                {
                    if(!st.isEmpty() && st.peek() == '{')
                    {
                        st.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
                else if(s.charAt(right) == ']')
                {
                    if(!st.isEmpty() && st.peek() == '[')
                    {
                        st.pop();
                    }
                    else
                    {
                        return false;
                    }
                }
            }
            right++;
        }

        return st.isEmpty() ? true:false;
    }
}