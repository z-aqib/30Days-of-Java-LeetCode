class Solution {
    public int removeElement(int[] nums, int val) {
        int moving_length = 0;
        int count_remaining = nums.length;
        for (int i = 0; i < nums.length;) {
            if (nums[i] == val) {
                moving_length++;
                count_remaining--;
            } else
                i++;
            if (i + moving_length < nums.length)
                nums[i] = nums[i + moving_length];
            else
                break;
        }
        return count_remaining;
    }
}