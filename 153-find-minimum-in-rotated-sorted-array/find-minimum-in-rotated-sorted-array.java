class Solution {
    public int findMin(int[] nums) {
        // so this approach is using O(logn) time complexity
        // in this we did binary search. we started from the first and last index of
        // array and get the middle. update minimum. then if the middle is greater than
        // the right side, move to that half, if it is lesser, move to that half. keep
        // computing until the first is greater than the last.

        int left = 0;
        int right = nums.length - 1;
        int minimum = nums[0];  
        while (left <= right) {
            int mid = (left + right) / 2;
            minimum = Math.min(minimum, nums[mid]); // find the minimum value
            if (nums[mid] > nums[right]) { // if it is greater than the right value, move left
                left = mid + 1;
            } else { // if it is greater than the left value, move right
                right = mid - 1;
            }
        }
        return minimum;
    }
}