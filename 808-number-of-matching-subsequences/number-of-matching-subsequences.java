class Solution {
    public boolean charan(String x , String word){
        int i = 0;
        int j = 0;
        while(i<x.length() && j<word.length()){
            if(word.charAt(j)==x.charAt(i)){
                j++;
            }
            i++;
        }
        if(j == word.length()) return true;
        else return false;

    }
    public int numMatchingSubseq(String s, String[] words) {
        HashMap<String,Integer>hs =  new HashMap<>();
        for(String a : words){
            hs.put(a,hs.getOrDefault(a,0)+1);
        }
        int c = 0;
        for(String p : hs.keySet()){
            if(charan(s,p)){
                c+=hs.get(p);
            }
        }
        return c;
        
    }
}