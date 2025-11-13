class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,maxlen=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            int zeros = 0;
            for(int j=i;j<n;j++){
                if(nums[j] == 0) zeros++;
                if(zeros <= k) maxlen = Math.max(maxlen,j-i+1);
                if(zeros > k) break;
            }
        }
        return maxlen;
    }
}