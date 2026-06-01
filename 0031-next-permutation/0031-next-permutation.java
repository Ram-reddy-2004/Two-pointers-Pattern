class Solution {
    public void nextPermutation(int[] nums) {
        int n=nums.length;
        int idx=-1;
        //find longest prefix
        for(int i=n-2;i>=0;i--){
            if(nums[i] < nums[i+1]) {
                idx=i;
                break;
            }
        }
        if(idx==-1) {
            reverse(nums,0,n-1);
        }
        //find slightly larger element
        else{   
            for(int i=n-1;i>idx;i--){
                if(nums[idx] < nums[i]){
                    int temp=nums[i];
                    nums[i]=nums[idx];
                    nums[idx]=temp;
                    break;
                }
            }
            reverse(nums,idx+1,n-1);
        }
    }
    void reverse(int[] nums,int left,int right){
        while(left<right){
                int temp=nums[left];
                nums[left]=nums[right];
                nums[right]=temp;
                left++;
                right--;
            }
    }
    
}