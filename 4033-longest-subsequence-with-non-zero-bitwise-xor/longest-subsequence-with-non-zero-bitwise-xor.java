class Solution {
    public int longestSubsequence(int[] nums) {
        int xor = 0;
        int cnt = 0;
        for(int n : nums){
            if(n==0){
                cnt++;
            }
        }
        if(cnt==nums.length){
            return 0;
        }
        for(int n : nums){
            xor^=n;
        }
            if(xor!=0){
                return nums.length;
            }
            else{
                return nums.length-1;
            }
        

        
    }
}