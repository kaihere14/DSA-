class Solution {
    public List<Integer> majorityElement(int[] arr) {
        int minLen = arr.length/3;
        int count = 0;
        List<Integer> answer = new ArrayList<>();
        for(int i =0;i<arr.length;i++){
            count=0;
            for(int j=i;j<arr.length;j++) {
                if (arr[i]==arr[j]) {
                        count++;
                    }
                }
            if(count>minLen && !answer.contains(arr[i])){
                answer.add(arr[i]);
            }
        }
        return answer;
    }
}