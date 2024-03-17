class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
         * so the approach is that we will sort the array using Arrays.sort(nums) and
         * then compare each ith index with its i+1th index; if they have same value
         * that means duplicates exist, else at the end of the loop, they do not exist.
         */
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1])
                return true;
        }
        return false;
    }
}