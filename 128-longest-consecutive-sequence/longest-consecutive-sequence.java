class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer>set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        if(set.size() == 0){
            return 0;
        }
        int max = 0;
        for(int x : set){
            if(!set.contains(x-1)){
                int cnt = 1;
                int curr = x;
                while(set.contains(curr + 1)){
                    curr++;
                    cnt++;
                } 
                max = Math.max(max,cnt);
            }
           
        }
        return max;
        
    }
}