class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];List<Integer>ls = new ArrayList<>();
        for(int n : nums){
            min = Math.min(min,n);
            max = Math.max(max,n);
            ls.add(n);
        }
        List<Integer>ans = new ArrayList<>();
        
        for(int i = min;i<=max;i++){
            if(!ls.contains(i)){
                ans.add(i);
            }
        }
        return ans;
        
    }
}