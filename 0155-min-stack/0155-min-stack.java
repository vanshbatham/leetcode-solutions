class MinStack {
    Deque<Integer> deque = new ArrayDeque<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        deque.push(val);
        
    }
    
    public void pop() {
        deque.pollFirst();
    }
    
    public int top() {
        return deque.peek();
        
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int num : deque) {
            if (num < min) {
                min = num;
            }
        }
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