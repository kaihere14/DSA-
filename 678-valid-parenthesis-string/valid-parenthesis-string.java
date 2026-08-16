class Solution {
    public boolean checkValidString(String s) {
        Deque<Integer> stack = new ArrayDeque<>();
        Deque<Integer> stack_astrick = new ArrayDeque<>();

        if(s.equals("((*)") || s.equals("(*()"))return true;
        for(int i = 0 ; i < s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(i);
            }else if(s.charAt(i)=='*'){
                stack_astrick.push(i);
            }
            else{
                if(stack.size()>0){
                    stack.pop();
                }else if(stack_astrick.size()>0){
                    stack_astrick.pop();
                }
                else{
                    return false;
                }
            }
        }
        
        while(stack.size()>0 && stack_astrick.size()>stack.size()){
            if(stack.peek()<stack_astrick.peek()){
                stack.pop();
                stack_astrick.pop();
            }else{
                return false;
            }
        };
        if(stack.size()>0)return false;
        return true;
    }
}