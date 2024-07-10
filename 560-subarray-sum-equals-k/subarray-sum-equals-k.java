class Solution {
    public int subarraySum(int numbers[], int k) {
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = i; j < numbers.length; j++) {
                sum += numbers[j];
                if (sum == k) {
                    count++;
                }
            }
        }
        return count;
    }

    public static void main(String args[]) {
        int numbers[] = {1, 1, 1};
        Solution solution = new Solution();
        int result = solution.subarraySum(numbers, 2);
        System.out.println("Number of subarrays with sum " + 2 + ": " + result);
    }
}