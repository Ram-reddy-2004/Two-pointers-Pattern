class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int zeros = 0;
        int max_count =0;
        int n = nums.length;

        for(int r=0;r<n;r++){
            if(nums[r] == 0) zeros++;
            while(zeros > k){ // shrinking condition
                if(nums[l] == 0) zeros--;
                l++;
            }
            max_count = Math.max(max_count,r-l+1);
        }
        return max_count;
    }
}