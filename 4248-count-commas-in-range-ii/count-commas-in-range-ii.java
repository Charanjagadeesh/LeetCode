class Solution {
    public long countCommas(long n) {
        long a = 1000;
        long res = 0;
        while(a<=n){
            res += n-a+1;
            a*=1000;
        }
        return res;
    }
}