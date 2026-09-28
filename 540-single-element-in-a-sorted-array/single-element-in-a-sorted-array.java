class Solution {
    public int singleNonDuplicate(int[] nums) {
        HashMap<Integer,Integer>hs = new HashMap<>();
        for(int n : nums){
            hs.put(n,hs.getOrDefault(n,0)+1);
        }int ele = 0;
        for(Map.Entry<Integer,Integer>entry : hs.entrySet()){
            
            if(entry.getValue() == 1){
                ele = entry.getKey();
            }
        }
        return ele;
        
    }
}