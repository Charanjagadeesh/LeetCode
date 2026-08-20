class Solution {
    public int largestInteger(int[] nums, int k) {
        HashMap<Integer,Integer>hs = new HashMap<>();
        for(int i=0;i<=nums.length-k;i++){
            HashSet<Integer>set = new HashSet<>();
            for(int j=i;j<i+k;j++){
                set.add(nums[j]);
            }
            for(int x : set){
                hs.put(x,hs.getOrDefault(x,0)+1);
            }
        }
        int ans = -1;
        for(Map.Entry<Integer,Integer>entry : hs.entrySet()){
            if(entry.getValue()==1){
                ans = Math.max(ans,entry.getKey());
            }
        }
        return ans;
        
    }
}