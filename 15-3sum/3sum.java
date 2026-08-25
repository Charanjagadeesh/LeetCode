class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>>ans = new HashSet<>();
        Arrays.sort(nums);
        for(int k = 0;k<nums.length-2;k++){
            int i = k+1;
            int j = nums.length-1;
        while(i<j){
         int sum = nums[i] + nums[k] + nums[j];
           
                if(sum == 0){
                    ans.add(Arrays.asList(nums[i],nums[j],nums[k]));
                    i++;
                    j--;
                   
                }
                else if(sum < 0){
                    i++;
                }
               else{
                j--;
               }
            }
            
        }
        return new ArrayList<>(ans);

         
        
    }
}