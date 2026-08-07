class StockSpanner {

    Deque<Integer> store = new ArrayDeque<>();
    Deque<Integer> day = new ArrayDeque<>();
    int curr_index = 0;
    int ans = 0;

    public StockSpanner() {
        
    }
    
    public int next(int price) {
        while(store.size()!=0 && store.getLast()<=price){
            store.removeLast();
            day.removeLast();
        }
        if(day.size()==0){
            curr_index++;
            ans = curr_index;
        }else{
            curr_index++;
            ans = curr_index-day.peekLast();
        }

        day.addLast(curr_index);
        store.addLast(price);
        
        return ans;
    }
}

/**
 * Your StockSpanner object will be instantiated and called as such:
 * StockSpanner obj = new StockSpanner();
 * int param_1 = obj.next(price);
 */