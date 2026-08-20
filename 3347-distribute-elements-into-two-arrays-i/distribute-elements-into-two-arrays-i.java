class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>(); 
        ArrayList<Integer> arr2 = new ArrayList<>(); 


        int arr1_pointer = 0;
        int arr2_pointer = 0;

        for(int i = 0 ; i < nums.length ; i++ ){
            if(arr1.size()==0){
                arr1.add(arr1_pointer,nums[i]);
                arr1_pointer++;
                continue;
            }else if(arr2.size()==0 ){
                arr2.add(arr2_pointer,nums[i]);
                arr2_pointer++;
                continue;
            }

            if(arr1.get(arr1_pointer-1)>=arr2.get(arr2_pointer-1)){
                arr1.add(arr1_pointer,nums[i]);
                arr1_pointer++; 
                continue;
            }else{
                arr2.add(arr2_pointer,nums[i]);
                arr2_pointer++;
                continue;
            }
        }

        
        int[] result = new int[arr1.size() + arr2.size()];
        int index = 0;

        
        for (int num : arr1) {
            result[index++] = num;
        }

        for (int num : arr2) {
            result[index++] = num;
        }

        return result;
    }
}