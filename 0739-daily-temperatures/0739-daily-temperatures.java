class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> st = new Stack<>();
        st.push(temperatures.length-1);
        result[temperatures.length-1] = 0;

        for(int i = temperatures.length-2;i>=0;i--)
        {
            while(!st.isEmpty() && temperatures[i]>=temperatures[st.peek()])
            {
                st.pop();
            }
            if(st.isEmpty())
            {
                result[i] = 0;
            }
            else
            {
                result[i] = st.peek() - i;
            }
            
            
            st.push(i);
        }


        return result;
    }
}