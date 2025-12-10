class Solution {
  

    public int longestConsecutive(int[] arr) {
        if(arr.length==0){
            return 0;
        }
        TreeSet<Integer> sortedNumbers = new TreeSet<>();
        for(int i = 0;i<arr.length;i++){
            sortedNumbers.add(arr[i]);
        }
        int count = 0;
        int max_count = 0;
        int prev=-1;
        boolean set  = false;
       for(int value : sortedNumbers){
           if (!set){
               prev = value;
               set=true;
               continue;
           }
           System.out.println("prev" + prev);
           if((value-1)==prev){
               count++;
           }else{
               count=0;
           }
           max_count= Math.max(max_count,count);
           prev=value;
          
        }
        return max_count+1;
    }
}