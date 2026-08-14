class Solution {
    public int maximumLengthSubstring(String s) {
        HashMap<Character,Integer>hs = new HashMap<>();
        int left = 0;
        int right = 0;
        int max = 0;
        while(right < s.length()){
            hs.put(s.charAt(right),hs.getOrDefault(s.charAt(right),0)+1);
            while(hs.get(s.charAt(right))>2){
                hs.put(s.charAt(left),hs.get(s.charAt(left))-1);
                left++;
            }
            max = Math.max(max,right-left+1);
            right++;
        }
        return max;
    }
}