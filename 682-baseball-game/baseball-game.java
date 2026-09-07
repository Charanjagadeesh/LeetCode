class Solution {
    public int calPoints(String[] operations) {
        ArrayDeque<Integer>ad = new ArrayDeque<>();
        for(String s : operations){
            if(s.equals("C")){
                ad.pop();
            }
            else if(s.equals("D")){
                int fir = ad.peek();
                int n = 2*fir;
                ad.push(n);
            }
            else if(s.equals("+")){
                int first = ad.pop();
                int sec = ad.peek();
                ad.push(first);
                int sum = first + sec;
                ad.push(sum);
            }
            else{
                ad.push(Integer.parseInt(s));
            }
        }
        int sum = 0;
        while(!ad.isEmpty()){
            sum+=ad.pop();
        }
        return sum;

        
    }
}