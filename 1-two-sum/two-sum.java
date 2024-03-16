class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
         * so this can easily be done using two for loops, get each value and check if
         * they add up to target. but we need to check, what if i == j (the values we
         * get are the same value?) then we should not sum them. but if we use an
         * if-condition, it makes our time complexity 90ms. so we can apply that i
         * starts from 1 and j starts from i, and it computes (j-i) and i.
         */
        for (int i = 1; i < nums.length; i++) {
            for (int j = i; j < nums.length; j++) {
                if (nums[j] + nums[j - i] == target) {
                    return new int[] { j - i, j };
                }
            }
        }
        return new int[] { -1, -1 };
    }
}