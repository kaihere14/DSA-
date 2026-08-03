class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack();
        
        for(int i = 0 ; i < asteroids.length ; i++ ){
            if(asteroids[i] < 0 ){
                while(stack.size() != 0  && stack.peek() < -asteroids[i] && stack.peek() >= 0){
                    stack.pop();
                }
                if(stack.size() != 0   && stack.peek() == -asteroids[i] && stack.peek() >= 0){
                    stack.pop();
                }
                else if(stack.size()==0 || stack.peek()<0 && asteroids[i] < 0){
                    stack.push(asteroids[i]); 
                }
            
            }else{
                stack.push(asteroids[i]); 
            }
        }
        int[] ans = new int[stack.size()];

        for (int i = 0; i < stack.size(); i++) {
            ans[i] = stack.get(i);
        }

        return ans;
    }
}