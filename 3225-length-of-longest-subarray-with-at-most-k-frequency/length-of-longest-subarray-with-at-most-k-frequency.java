class Solution {
    // public static boolean charan(int x,int c){
    //     HashMap<Integer,Integer>hs = new HashMap<>();
    //     hs.put(x,hs.getOrDefault(x,0)+1);
    //     for(Map.Entry<Integer,Integer>entry : hs.entrySet()){
    //         if(entry.getValue()<=c){
    //             return true;
    //         }
    //     }
    //     return false;
    // }
    public int maxSubarrayLength(int[] nums, int k) {
        int left = 0;
        int max = 0;
        int right = 0;
        HashMap<Integer,Integer>hs = new HashMap<>();
        while(right<nums.length){
            hs.put(nums[right],hs.getOrDefault(nums[right],0)+1);
            while(hs.get(nums[right])>k){
                hs.put(nums[left],hs.get(nums[left])-1);
                left++;
            }
            

           max = Math.max(max,right-left+1);
            right++;
        }
        return max;
        
    }
}