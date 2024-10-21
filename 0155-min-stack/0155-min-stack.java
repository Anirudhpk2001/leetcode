class MinStack {
    Stack<Integer> st;
    public MinStack() {
        st =new Stack<>();
    }
    
    public void push(int val) {
        
        st.push(val);
    }
    
    public void pop() {
        
        if(!st.isEmpty())
        {
            st.pop();
        }
    
    }
    
    public int top() {
        int top=0;
      if(!st.isEmpty())
        {
            top=st.peek();
        }
        return top;
        
    }
    
    public int getMin() {
       
         Stack<Integer> s = (Stack<Integer>) st.clone();
        int min=Integer.MAX_VALUE;
       
        while(!s.isEmpty())
        {
            int val=s.peek();
           
            min=Math.min(val,min);
             
            s.pop();
        }
        System.out.println(min);
        return min;
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */