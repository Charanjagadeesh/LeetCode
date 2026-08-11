class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        HashMap<Character,Integer>hs = new HashMap<>();
        for(char ch : p.toCharArray()){
            hs.put(ch,hs.getOrDefault(ch,0)+1);
        }
        int left = 0;
        int right = 0;
        HashMap<Character,Integer>ch = new HashMap<>();
        List<Integer>ans = new ArrayList<>();
        int k = p.length();
        while(right<s.length()){
            char c = s.charAt(right);
            ch.put(c,ch.getOrDefault(c,0)+1);
            if(right-left+1 > k){
                char r = s.charAt(left);
                ch.put(r,ch.get(r)-1);
                if(ch.get(r)==0){
                    ch.remove(r);
                }
                left++;
            }
            if(right-left+1 == k &&hs.equals(ch)){
                ans.add(left);
            }
            right++;
        }
        return ans;
        

    }
}