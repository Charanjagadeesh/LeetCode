class Solution {
    public String removeDuplicates(String s) {
        Stack<Character>ad = new Stack<>();
        for(char ch :  s.toCharArray()){
            if(!ad.isEmpty() && ad.peek()==ch){
                ad.pop();
            }
           else ad.push(ch);
        } StringBuilder sb = new StringBuilder();
            for(char c : ad){
                sb.append(c);
            }
            return sb.toString();


        
    }
}