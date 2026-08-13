class Solution {
    public int numOfSubarrays(int[] arr, int k, int threshold) {
        int sum = 0;
        int right = 0;
        int left = 0;
        int cnt = 0;
        while(right<arr.length){
            sum+=arr[right];
            if(right-left+1 > k){
                sum-=arr[left];
                left++;
            }
            if(right-left+1 == k){
            double avg = (double)sum/k;
            if(avg>=threshold){
                cnt++;
            }
            }
            right++;
        }
        return cnt;
        
    }
}