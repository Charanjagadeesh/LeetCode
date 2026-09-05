class Solution {
    public int firstStableIndex(int[] nums, int k) {
        int[] min = new int[nums.length];
        int[] max = new int[nums.length];
        max[0] = nums[0];
        min[nums.length-1] = nums[nums.length-1];
        for(int i = 1;i<nums.length;i++){
            max[i] = Math.max(nums[i],max[i-1]);
        }
        for(int j=nums.length-2;j>=0;j--){
            min[j] = Math.min(nums[j],min[j+1]);
        }
        int index = -1;
        for(int i=0;i<nums.length;i++){
            int ans = max[i] - min[i];
            if(ans <= k){
                index = i;
                break; 
            }
        }
        return index;

        
    }
}