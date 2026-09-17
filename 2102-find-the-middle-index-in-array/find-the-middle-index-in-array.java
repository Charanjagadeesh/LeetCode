class Solution {
    public int findMiddleIndex(int[] nums) {
        int ps =0;
        int ss = 0;
        int cs = 0;
        for(int i = 0;i<nums.length;i++){
                cs += nums[i];
        }
        for(int i=0;i<nums.length;i++){
            ss = cs -nums[i] - ps;
            if(ps == ss){
                return i;
            }
            ps = nums[i] + ps;
           
        } return -1;
        
    }
}