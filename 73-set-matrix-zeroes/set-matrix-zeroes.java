class Solution {
    public void setZeroes(int[][] arr) {
        
        for(int i =0 ;i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                if(arr[i][j]==0){
                    for(int l =0;l<arr.length;l++){
                        if(arr[l][j]!=0){
                            arr[l][j]=-999;
                        }
                    }
                     for(int k =0;k<arr[i].length;k++){
                        if(arr[i][k]!=0){
                            arr[i][k]=-999;
                        }
                    }
                    
                }
            }
        }

        
            for(int i =0 ;i<arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==-999){
                    arr[i][j]=0;
                }
            }
        }
        
    }
}