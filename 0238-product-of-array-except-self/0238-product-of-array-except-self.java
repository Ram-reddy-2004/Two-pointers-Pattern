class Solution {
    public int[] productExceptSelf(int[] nums) {
        int[] lres = new int[nums.length];
        int[] rres = new int[nums.length];
        int res[] = new int[nums.length];
        int product = 1;
        for(int i=0;i<nums.length;i++){
            product *= nums[i];
            lres[i] =  product;
        }
        product=1;
        for(int i = nums.length-1;i>=0;i--){
            product *= nums[i];
            rres[i] = product;
        }
        for(int i=0;i<nums.length;i++){
            if(i==0) res[i]=rres[i+1];
            else if(i==nums.length-1) res[i]=lres[nums.length-2];
            else res[i]=lres[i-1]*rres[i+1];
        }
        return res;
    }
}