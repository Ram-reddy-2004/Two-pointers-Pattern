class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {
        if(k<=1) return 0;

        int n = nums.length;
        int count=0;
        int left=0;
        int product=1;

        for(int right=0;right < n;right++){
            product *= nums[right];
            while(product >= k){ // shrinking phase
                product /= nums[left];
                left++;
            }
            count += right-left+1 ;// to calculate no of sub arrays we use this 
        }
        return count;
    }
}