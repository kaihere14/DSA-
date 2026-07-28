class MyQueue {
    Deque<Integer> stack_main = new ArrayDeque<>();
    Deque<Integer> stack_secondary = new ArrayDeque<>();

    
    public MyQueue() {
        
    }
    
    public void push(int x) {
        this.stack_main.push(x);
    }
    
    public int pop() {
        int ans = -1;
        
        if(this.stack_main.size()>1){
            while(this.stack_main.size()!=1){
                this.stack_secondary.push(this.stack_main.pop());
            }
            ans = this.stack_main.pop();
            while(this.stack_secondary.size()!=0){
                this.stack_main.push(this.stack_secondary.pop());
            }
        }else{
            ans = this.stack_main.pop();
        }
        return ans;
    }
    
    public int peek() {
         int ans = -1;
        
        if(this.stack_main.size()>1){
            while(this.stack_main.size()!=1){
                this.stack_secondary.push(this.stack_main.pop());
            }
            ans = this.stack_main.peek();
            this.stack_main.push(this.stack_secondary.pop());
            while(this.stack_secondary.size()!=0){
                this.stack_main.push(this.stack_secondary.pop());
            }
        }else{
            ans = this.stack_main.peek();
        }
        return ans;
    }
    
    public boolean empty() {
        return this.stack_main.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */