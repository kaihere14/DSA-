class Solution {
    public List<List<Integer>> fourSum(int[] arr, int target) {
        List<List<Integer>> answer = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            for(int j  =i+1; j<arr.length;j++){
                HashSet<Long>  value = new HashSet<>();
                for(int k=j+1;k<arr.length;k++){
                    long sum = (long) arr[i] + arr[j] + arr[k] ;
                    long leftOut = (long)(target-sum);
                    if(value.contains(leftOut)){
                        List<Integer> preAns = new ArrayList<>();
                        preAns.add(arr[i]);
                        preAns.add(arr[j]);
                        preAns.add(arr[k]);
                        preAns.add((int)leftOut);
                        preAns.sort(null);
                        if(!answer.contains(preAns)){
                            answer.add(preAns);
                        }
                    }else{
                        value.add((long)arr[k]);
                    }
                }
            }
        }
        return answer;
    }
}