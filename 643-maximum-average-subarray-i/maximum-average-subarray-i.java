class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double sum = 0.0;
        double max =  Integer.MIN_VALUE;
        int j = 0;
        for(int i = 0;i<nums.length;i++){
            sum+=nums[i];
            if(i>=k-1){
                max = Math.max(max,sum/k);
                //remove one excess element
                sum -=nums[j];
                j++;
            }
        }
        return max; 
    }
}