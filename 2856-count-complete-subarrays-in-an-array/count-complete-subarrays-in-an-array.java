import java.util.*;

class Solution {
    public int countCompleteSubarrays(int[] nums) {
        int n = nums.length;
        
        // Step 1: Count total unique elements in the array
        Set<Integer> totalSet = new HashSet<>();
        for (int num : nums) {
            totalSet.add(num);
        }
        int totalUnique = totalSet.size();

        int count = 0;

        // Step 2: Iterate over all subarrays
        for (int i = 0; i < n; i++) {
            Set<Integer> subarraySet = new HashSet<>();
            for (int j = i; j < n; j++) {
                subarraySet.add(nums[j]);
                if (subarraySet.size() == totalUnique) {
                    count++;
                }
            }
        }

        return count;
    }
}
