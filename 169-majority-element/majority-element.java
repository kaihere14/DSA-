class Solution {
    public int majorityElement(int[] arr) {
        int n = arr.length/2;
        HashMap<Integer,Integer> lenArr = new HashMap<>();
        for(int i =0;i<arr.length;i++){
            if(lenArr.containsKey(arr[i])){
                lenArr.put(arr[i], lenArr.getOrDefault(arr[i], 0) + 1);
            }else{
                lenArr.put(arr[i],1);
            }
        }
       for (Map.Entry<Integer, Integer> entry : lenArr.entrySet()) {
            if(entry.getValue()>n){
               return entry.getKey();
            }
        }
        return 0;
    }
}