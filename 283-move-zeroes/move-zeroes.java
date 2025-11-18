class Solution {
    public void moveZeroes(int[] arr) {
        ArrayList<Integer> nonZero = new ArrayList<>();
        for(int i = 0;i< arr.length;i++){
            if(arr[i]!=0){
                nonZero.add(arr[i]);
            }
        }
        for(int i =0;i< arr.length;i++){
            if(i<nonZero.size()){
                arr[i]=nonZero.get(i);
            }else{
                arr[i]= 0;
            }
        }
    }
}