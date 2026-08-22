class Solution {
    public boolean SumPro(int n){
        int temp = n;
        int pro = 1;
        int sum = 0;
        while(temp>0){
            int rem = temp%10;
            pro*=rem;
            sum+=rem;
            temp/=10;
        }
        
       
        return (n % (sum+pro) == 0);
        
    }
    public boolean checkDivisibility(int n) {
        return SumPro(n);
        
    }
}