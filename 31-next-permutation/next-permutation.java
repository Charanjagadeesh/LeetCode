class Solution {
    public void nextPermutation(int[] nums) {
        int index = -1;
        int n = nums.length;
        //Find the less element in the increasing form [2 1 5 4 3 0 0] here 1 is decreasing
        for(int i = n-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                index = i;
                break;
            }
        }
        if(index == -1){
            reverse(nums,0,n-1);
            return;
        }
        //Check next element which is just greater than 1 its 3
          
        int swapIndex = -1;
        for(int j =n-1;j>index;j--){
            if(nums[j]>nums[index]){
                swapIndex = j;
                break;
            }
        }//now swap both 
        swap(nums,index,swapIndex);
        //then reverse from nextIndex to last
        reverse(nums,index+1,n-1);
    }

        private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums,int i,int j){
        while(i<j){
            swap(nums,i,j);
            i++;
            j--;
        }
    }

}