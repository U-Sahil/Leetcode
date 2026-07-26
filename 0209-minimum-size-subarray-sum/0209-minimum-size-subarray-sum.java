class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int left = 0;
        int currentSum = 0;
        int minLen = n + 1;

        for (int right = 0; right < n; right++) {
            currentSum += nums[right];

            
            while (currentSum >= target) {
                minLen = Math.min(minLen, right - left + 1);
                currentSum -= nums[left];
                left++;
            }
        }

        return minLen == n + 1 ? 0 : minLen;
    }
}