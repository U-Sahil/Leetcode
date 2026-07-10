class Solution {
    public int maxArea(int[] height) {
        int maxArea = 0;
        int left = 0;
        int right = height.length - 1;
        while (left < right) {
            // Calculate area with current left and right pointer
            int area = Math.min(height[left], height[right]) * (right - left);
            // Update maxArea if current area is larger
            maxArea = Math.max(maxArea, area);

            // Move pointers inward from shorter height
            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }
        return maxArea;
        
    }
}