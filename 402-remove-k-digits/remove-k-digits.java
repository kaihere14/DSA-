class Solution {
    public String removeKdigits(String num, int k) {
        Stack<Character> stack = new Stack();
        String ans="";
        int curr_counter = 0;
        
        for(int i = 0 ; i < num.length() ; i++ ){
            
            while(stack.size()!=0 && stack.peek()>num.charAt(i) && curr_counter!=k){
                stack.pop();
                curr_counter++;
            }

            if(stack.size()==0 && num.charAt(i)=='0'){
                continue;
            } 
            stack.push(num.charAt(i));
        }
        if(curr_counter!=k){
            while(stack.size()!=0 && curr_counter!=k){
                stack.pop();
                curr_counter++;
            }
        }
        StringBuilder sb = new StringBuilder();

        for(char c : stack){
            sb.append(c);
        }

        return sb.length() == 0 ? "0" : sb.toString();
    }
}