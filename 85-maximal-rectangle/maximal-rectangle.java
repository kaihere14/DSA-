class Solution {

    Deque<Integer> stack = new ArrayDeque<>();
    Deque<Integer> stack2 = new ArrayDeque<>();

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

    public int largestRectangleArea(int[] heights) {

        int area = 0 ;
        int nse_counter[] = new int[heights.length];
        for(int i = heights.length-1 ; i>=0 ;i--){
            nse_counter[i] = this.gnse(heights,i);
        }
        
        for(int i = 0 ; i < heights.length ; i++){
            int pse = this.gpse(heights,i);
            int multi = (i-pse)+(nse_counter[i]-i)-1;
            int curr = heights[i]*multi;
            area = Math.max(area,curr);
        }
        return area;
    }

    public int maximalRectangle(char[][] matrix) {
        int area = Integer.MIN_VALUE;
    
        for(int i = 0 ; i < matrix.length ; i++ ){
            int height[] = new int[matrix[i].length];
            stack.clear();
            stack2.clear();
            for(int j = 0; j < matrix[0].length ; j++ ){
                int counter = 0;
                for(int k = i ; k < matrix.length ; k++){
                    if(matrix[k][j]=='0'){
                        break;
                    }
                    counter++;
                }
                height[j]=counter;
            }    
            
            area = Math.max(area,this.largestRectangleArea(height));
           
        }
        return area;
    }
}