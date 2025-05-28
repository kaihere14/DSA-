class Solution {
    public int diagonalSum(int[][] arr) {
        int sum1 =0;
        int sum2 =0;
        int total =0;
        for(int i =0;i<arr.length;i++){
            sum1 +=arr[i][i];
        }
        int start = 0;
        int end = arr[0].length-1;
        int mid1 = arr.length/2;
        int mid2 = arr[0].length/2;
        while(start<=arr.length-1&& end >=0 ){
            sum2 += arr[start][end];
            start++;
            end--;
        }
        if(arr.length%2!=0){
            total = sum1 +sum2 -arr[mid1][mid2];
        }else if (arr.length%2==0){
            total = sum1+sum2;
        }
        return total;
    }
}