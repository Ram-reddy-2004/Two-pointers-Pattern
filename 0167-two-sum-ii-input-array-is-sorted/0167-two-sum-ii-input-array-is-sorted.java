class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        int[] res ={-1,-1};
        while(i<j){
            int sum = numbers[i]+numbers[j];
            if(sum<target) i++;
            else if(sum>target) j--;
            else{
                res[0]=i+1;
                res[1]=j+1;
                break;
            }
            
        }
        return res;

    }
}