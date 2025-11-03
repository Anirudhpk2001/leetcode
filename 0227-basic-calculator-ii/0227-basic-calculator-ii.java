class Solution {
    public int calculate(String s) {
        s = s.replaceAll("\\s", ""); // remove spaces
        Stack<Integer> stack = new Stack<>();
        int num = 0;
        char sign = '+'; // default sign

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            }

            // If we reach an operator or end of string, process the number
            if (!Character.isDigit(ch) || i == s.length() - 1) {
                if (sign == '+') {
                    stack.push(num);
                } else if (sign == '-') {
                    stack.push(-num);
                } else if (sign == '*') {
                    stack.push(stack.pop() * num);
                } else if (sign == '/') {
                    stack.push(stack.pop() / num);
                }

                sign = ch;
                num = 0;
            }
        }

        // sum up everything in the stack
        int result = 0;
        for (int val : stack) {
            result += val;
        }

        return result;
    }
}
