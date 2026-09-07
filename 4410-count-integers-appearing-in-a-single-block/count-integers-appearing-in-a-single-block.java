class Solution {
    public int countSpecialIntegers(int[] nums) {
        Map<Integer,ArrayList<Integer>> m = new HashMap<Integer,ArrayList<Integer>>();
        for(int i = 0 ; i < nums.length ; i++){
            if(m.get(nums[i])==null){
                ArrayList<Integer> s = new ArrayList<Integer>();
                s.add(i);
                m.put(nums[i],s);
            }else{
                ArrayList<Integer> s = m.get(nums[i]);
                s.add(i);
                m.put(nums[i],s);
            }
        }
        int ans = 0;
        for (ArrayList<Integer> value : m.values()) {
            boolean greater = false;
            for(int i = 0 ; i < value.size()-1 ; i++ ){
                if((value.get(i+1)-value.get(i))>1){
                    greater = true;
                    break;
                }
            }
            if(!greater)ans++;
        }
        return ans;
    }
}