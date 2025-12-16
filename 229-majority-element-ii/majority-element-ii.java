class Solution {
    public List<Integer> majorityElement(int[] arr) {
         int minLen = arr.length/3;

        HashMap<Integer,Integer> counter = new HashMap();

        List<Integer> answer = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            if(counter.containsKey(arr[i])){
                int value = counter.get(arr[i]);
                counter.remove(arr[i]);
                counter.put(arr[i],value+1);
            }else{
               counter.put(arr[i],1) ;
            }
        }
        counter.forEach((key, value) -> {
            if(value>minLen && !answer.contains(key)){
                answer.add(key);
            }
        });
        return answer;
    }
}