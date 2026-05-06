class Solution {
    public int maxArea(int[] height) {
        
        int left=0;
        int right = height.length-1;
        int max = Integer.MIN_VALUE;
        while(left < right){
            int width = right - left;
            int index_area = Math.min(height[left],height[right]) * width;
            max = Math.max(max,index_area);
            if(height[left] < height[right]) left++;
            else right--;
        }
        return max;

    }
}