class MinStack {
    Stack<Integer> st;
    PriorityQueue<Integer> pq =new PriorityQueue<>();
    public MinStack() {
        st =new Stack<>();
    }
    
    public void push(int val) {
        
        st.push(val);
        pq.add(val);
    }
    
    public void pop() {
        
        if(!st.isEmpty())
        {
            int poped=st.pop();
            pq.remove(poped);
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
       
        return pq.peek();
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