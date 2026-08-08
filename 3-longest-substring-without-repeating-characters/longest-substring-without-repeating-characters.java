class Solution {
    public int lengthOfLongestSubstring(String s) {
       
        int arr[] = new int[128];
        for(int i = 0 ; i < arr.length ; i++){
            arr[i] = -1;
        }

        List<Character> ch = new ArrayList();
        int unique_counter = 0;
        for(int i = 0 ; i < s.length() ; i++ ){
            if(!ch.contains(s.charAt(i))){
                unique_counter++;
                ch.add(s.charAt(i));
            }
        }

        int left_pointer = 0;
        

        int ans = 0;

        for(int i = 0 ; i < s.length() ; i++){

            int index = arr[s.charAt(i)];
            if(index==-1){
                arr[s.charAt(i)]=i;
                System.out.println(arr[s.charAt(i)]);
            }else{
                if(index >= left_pointer){
                    left_pointer = index+1; 
                    arr[s.charAt(i)]=i;
                }else{
                    arr[s.charAt(i)]=i;
                }
            }
            ans = Math.max(ans,i - left_pointer +1);
            if(ans==unique_counter)return ans;

        }


        return ans;
    }
}