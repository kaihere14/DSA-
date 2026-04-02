class Solution {
    static  int findPeakElement(int[][] mat,int column){
        int max = Integer.MIN_VALUE;
        int row = 0;
        for(int i = 0 ; i<mat.length ;i++){
            if(max<mat[i][column]){
                max=mat[i][column];
                row = i;
            }
        }
        return row;
    }



    public static int[] findPeakGrid(int[][] mat) {
        int ans[] = {0,1};

        int low = 0;
        int high = mat[0].length-1;
        while(low<=high){
            int mid = low + (high - low)/2;
            int row = findPeakElement(mat,mid);
            int left = mid-1>=0?mat[row][mid-1]:-1;
            int right = mid+1<mat[0].length?mat[row][mid+1]:-1;
            if(mat[row][mid]>left && mat[row][mid]>right){
                ans[0]=row;
                ans[1]=mid;
                return ans;
            }else if (mat[row][mid]<left)high = mid-1;
            else low = mid+1;
        }

        return ans;
    }
}