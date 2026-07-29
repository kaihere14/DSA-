class MinStack {
    Deque<Integer> stack = new ArrayDeque<>();
    Deque<Integer> min_values = new ArrayDeque<>();

    public MinStack() {
        
    }
    
    public void push(int value) {
        if(this.min_values.size()==0){
            this.min_values.push(value);
        }else{
            this.min_values.push(Math.min(value,this.min_values.peek()));
        }
        stack.push(value);
    }
    
    public void pop() {
        stack.pop();
        this.min_values.pop();
    }
    
    public int top() {
        return stack.peek();
    }
    
    public int getMin() {
        return this.min_values.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(value);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */