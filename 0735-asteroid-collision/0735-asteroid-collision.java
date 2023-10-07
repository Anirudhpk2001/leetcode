class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack=new Stack<>();
        for(int i:asteroids)
        {
            if(stack.isEmpty() || i>0)
            {
                stack.push(i);
            }
            else
            {
                while(!stack.isEmpty() && stack.peek()>0 && Math.abs(stack.peek())<Math.abs(i))
                {
                    stack.pop();
                }
                if(!stack.isEmpty() && (-stack.peek()==i || stack.peek()==-i))
                {
                    stack.pop();
                }
                else if(stack.isEmpty() || (!stack.isEmpty() && stack.peek() <0 && i<0)){
                    stack.push(i);
                }
            }
         }
            int[] result=new int[stack.size()];
            int n=stack.size()-1;
            while(!stack.isEmpty())
            {
                result[n--]=stack.pop();
            }
        

        return result;
    }
}