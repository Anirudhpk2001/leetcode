class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Stack<Integer> st = new Stack<>();
        st.push(temperatures.length-1);
        int[] result = new int[temperatures.length];
        result[temperatures.length-1] = 0;


        for(int i=temperatures.length-2;i>=0;i--)
        {
            int currTemp = temperatures[i];
            while(!st.isEmpty() && currTemp >= temperatures[st.peek()])
            {
                st.pop();
            }

            if(st.isEmpty())
            {
                result[i] = 0;
            }
            else
            {
                result[i] = st.peek() - i ;
            }

            st.push(i);

        }

        return result;
    }
}