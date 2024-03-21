class Solution {
    public int removeElement(int[] nums, int val) {
        int moving_length = 0;
        for (int i = 0; i < nums.length;) {
            if (nums[i] == val)
                moving_length++;
            else
                i++;
            if (i + moving_length < nums.length)
                nums[i] = nums[i + moving_length];
            else
                break;
        }
        return (nums.length - moving_length);
    }
}