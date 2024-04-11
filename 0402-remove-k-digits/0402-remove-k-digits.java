import java.util.Stack;

class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> st = new Stack<>();
        
        for(char c : num.toCharArray()) {
            while(!st.isEmpty() && k > 0 && st.peek() > c) {
                st.pop();
                k--;
            }

            st.push(c);
        }
        
        // If k is still greater than 0, remove remaining digits from the end
        while(k > 0 && !st.isEmpty()) {
            st.pop();
            k--;
        }
        if(st.isEmpty())
        {
            return "0";
        }
        // Construct the result string
        StringBuilder sb = new StringBuilder();
        while(!st.isEmpty()) {
            sb.append(st.pop());
        }
        sb.reverse();
        
        // Remove leading zeros
        while(sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        
        return sb.toString();
    }
}
