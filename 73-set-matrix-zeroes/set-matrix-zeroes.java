class Solution {
    public void setZeroes(int[][] arr) {
        class Pair {
            int key;
            int value;

            Pair(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        List<Pair> list = new ArrayList<>();
        
        for(int i = 0; i< arr.length;i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[i][j]==0){

                    list.add(new Pair(i, j));
                }
            }
        }
        for (Pair p : list) {
            System.out.println(p.key + " : " + p.value);
            int j = p.value;
            int i = p.key;

                for(int k =0 ;k<arr[i].length;k++){
                    arr[i][k]=0;
                }

                for(int l = 0 ;l<arr.length;l++ ){
                    arr[l][j]=0;
                }
        }
    }
}