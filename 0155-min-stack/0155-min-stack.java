class MinStack {
    Stack<Integer> stack;
    PriorityQueue<Integer> Minq;
    public MinStack() {
        stack = new Stack<>();
        Minq = new PriorityQueue<>();
    }
    
    public void push(int val) {
        stack.push(val);

        Minq.add(val);
    }
    
    public void pop() {
        if(!stack.isEmpty())
        {
            Minq.remove(stack.pop());
        }
        
    }
    
    public int top() {
        if(!stack.isEmpty())
        {
            return stack.peek();
        }
        return -1;
    }
    
    public int getMin() {
        if(!Minq.isEmpty())
        {
            return Minq.peek();
        }
        return -1;
        
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