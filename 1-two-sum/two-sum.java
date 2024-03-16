class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
         * so this can easily be done using two for loops, get each value and check if
         * they add up to target. but we need to check, what if i == j (the values we
         * get are the same index?) then we should not sum them. but if we use an
         * if-condition, it makes our time complexity 90ms. so we can apply that i
         * starts from 1 and j starts from i, and it computes (j-i) and i. this makes it
         * faster (0ms)
         */
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[j] + nums[i] == target) {
                    return new int[] {i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}