class Solution {
    public String reverseVowels(String str) {
        String vowels = "aeiouAEIOU";
        char[] s = str.toCharArray();
        int l = 0;
        int h = s.length-1;
        while(l<h){
           
             while(l<h && vowels.indexOf(s[l])==-1){
                l++;
            }
            while(l<h && vowels.indexOf(s[h])==-1){
                h--;
            }   
                char rev = s[h];
                s[h] = s[l];
                s[l] = rev;
                 l++;
                 h--;
        }
        return new String(s);
        
    }
}