class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1;
        int mid = 0;
        int minimum = nums[0];
        while (left <= right) {
            mid = (left + right) / 2;
            minimum = Math.min(minimum, nums[mid]);
            if (nums[mid] > nums[right]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return minimum;
    }
}