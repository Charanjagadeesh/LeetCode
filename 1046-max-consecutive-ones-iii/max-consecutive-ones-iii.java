class Solution {
    public int longestOnes(int[] nums, int k) {
        int max = -1;
        int left = 0;
        int right = 0;
        int cnt = 0;
        while(right<nums.length){
            if(nums[right]==0){
                cnt++;
            }
            while(cnt>k){
                if(nums[left]==0){
                    cnt--;
                }
                left++;
            }
            max = Math.max(max,right-left+1);
            right++;
        }
        return max;
        
    }
}