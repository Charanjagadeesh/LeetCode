class Solution {
    public static int findNext(int n , int[] num){
        for(int x : num){
            if(n == x){
                return  findNext(n+1,num);
            }
        }
        return n;
    }
    public int missingInteger(int[] nums) {
        int fre = nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]==nums[i-1]+1){
                fre+=nums[i];
            }
            else{
                break;
            }
        }
        int ans = findNext(fre,nums);
        return ans;

    }
}