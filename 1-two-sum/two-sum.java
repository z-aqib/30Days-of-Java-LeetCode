class Solution {
    public int[] twoSum(int[] nums, int target) {
        /*
         * so this can easily be done using two for loops, get each value and check if
         * they add up to target. 
         */
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        return new int[] { i, j };
                    }
                }
            }
        }
        return new int[] { -1, -1 };
    }
}