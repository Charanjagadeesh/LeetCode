class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer>hs = new HashMap<>();
        for(char c : s1.toCharArray()){
            hs.put(c,hs.getOrDefault(c,0)+1);
        }
        int left = 0;
        int right = 0;
        HashMap<Character,Integer>ls = new HashMap<>();
        while(right<s2.length()){
            ls.put(s2.charAt(right),ls.getOrDefault(s2.charAt(right),0)+1);
            if(right-left+1 > s1.length()){
                char ch = s2.charAt(left);
                int cnt = ls.getOrDefault(ch,0)-1;
                if(cnt ==0){
                    ls.remove(ch);
                }
                else{
                    ls.put(ch,cnt);
                }
                left++;
            }
            if(ls.equals(hs)){
                return true;
            }
            right++;
        }
        return false;
    }
}