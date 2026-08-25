class Solution {
    public int sumDivisibleByK(int[] nums, int k) {
        HashMap<Integer,Integer>hs = new HashMap<>();
        for(int n : nums){
            hs.put(n,hs.getOrDefault(n,0)+1);
        }
        int sum = 0;
        for(Map.Entry<Integer,Integer>entry : hs.entrySet()){
            if(entry.getValue()%k==0){
                int x = entry.getKey();
                int num = entry.getValue();
                while(x-- > 0){
                    sum+=num;
                }
            }
        }
        return sum;
        
        
        
    }
}