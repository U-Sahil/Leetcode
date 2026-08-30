import java.util.HashMap;
import java.util.Map;

class Solution {
    public int countSpecialIntegers(int[] nums) {
        
        Map<Integer, Integer> blockCounts = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (i == 0 || nums[i] != nums[i - 1]) {
                    blockCounts.put(nums[i],                         blockCounts.getOrDefault(nums[i], 0) + 1);
            }
        }

        int specialCount = 0;
        for (int count : blockCounts.values()) {
            if (count == 1) {
                specialCount++;
            }
        }

        return specialCount;
    }
}