class Solution {
    public int maxSubArray(int[] nums) {
        int Sum = nums[0];
        int MaxSum = nums[0];
        for(int i=1;i<nums.length;i++){
            Sum = Math.max(nums[i],Sum + nums[i]);
            MaxSum = Math.max(Sum,MaxSum);
        }
        
        return MaxSum;
    }
}