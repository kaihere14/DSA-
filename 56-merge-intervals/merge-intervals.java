
class Solution {
    public static int[][] merge(int[][] intervals) {
       int ans[][] =new int[intervals.length][intervals[0].length];
       int prev = 0;
       int curr = 0;
       Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
       
       for(int i =0 ;i<intervals.length;i++){
        if(i==0){
            ans[curr++]=intervals[0];
            continue;
        }
        if(ans.length==0 || ans[prev][1]<intervals[i][0]){
            ans[curr++]=intervals[i];
            prev++;
        }else{
            ans[prev][1]= Integer.max(ans[prev][1],intervals[i][1]);
        }
       }
       return Arrays.copyOfRange(ans, 0, curr);
    }
}