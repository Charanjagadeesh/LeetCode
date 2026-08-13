class Solution {
    public int[] limitOccurrences(int[] nums, int k) {
        int[] fre = new int[101];
        for(int n : nums){
            fre[n]++;
        }
        ArrayList<Integer>ls = new ArrayList<>();
        int r = 0;
        while(r<nums.length){
        int a = fre[nums[r]];
        int p = a;
        int b = k;
        while(p!=0 && b>0){
            ls.add(nums[r]);
            b--;
            p--;
        }
        r+=a;
    }
    int x = 0;
    int ans[] = new int[ls.size()];
    for(int n : ls){
        ans[x++] = n;
    }
    return ans;



    }
}