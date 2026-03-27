class Solution {
    public int maxSubArray(int[] nums) {
        int l=0,r=0;
        int sum=0;
        int max = Integer.MIN_VALUE;
        while(r<nums.length){
            sum+= nums[r];
            if(sum <0 ){
                sum = 0 ;
                l = r+1;
            }
            if(max < sum){
                max = sum;
            }
            r++;
        }
        if(max == 0){
            max = Integer.MIN_VALUE;
            for(int i=0;i<nums.length;i++){
                if(nums[i] > max){
                    max = nums[i];
                }
            }
        }
        return max;
    }
}