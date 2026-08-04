class Solution {
    Stack<Integer> stack = new Stack();
    Stack<Integer> stack2 = new Stack();

    public int gpse(int[] arr , int index){
            
            while(stack.size()!=0 && arr[stack.peek()]>arr[index]){
                stack.pop();
            }
            if(stack.size()==0){
                stack.push(index);
                return -1;
            }else{
                int ans = stack.peek();
                stack.push(index);
                return ans;
            }
    }

    public int gnse(int[] arr , int index){
        
            while(stack2.size()!=0 && arr[stack2.peek()]>=arr[index]){
                stack2.pop();
            }
            if(stack2.size()==0){
                stack2.push(index);
                return arr.length;
            }else{
                int ans = stack2.peek();
                stack2.push(index);
                return ans;
            }
    }

    public int sumSubarrayMins(int[] arr) {
        long total = 0 ;
        int nse_store[] = new int[arr.length];
        
        for(int i = arr.length - 1; i >= 0; i--){
            nse_store[i] = gnse(arr, i);
        }

        for(int i = 0 ; i <arr.length ; i++){ 
            int pse = this.gpse(arr,i); 
            total += 1L*(i - pse) * (nse_store[i] - i) * arr[i]; 
        }


        total = total%1_000_000_007;
        return (int)total;
    }
}