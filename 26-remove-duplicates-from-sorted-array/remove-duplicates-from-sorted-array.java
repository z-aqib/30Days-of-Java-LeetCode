class Solution {

    public int removeDuplicates(int[] nums) {
        int k = nums.length;
        for (int i = 1; i < k;) {
            if (nums[i - 1] == nums[i]) {
                k--;
                int temp_i = i;
                while (temp_i + 1 <= k) {
                    nums[temp_i] = nums[temp_i++ + 1];
                }
            } else
                i++;
        }
        return k;
    }
}
