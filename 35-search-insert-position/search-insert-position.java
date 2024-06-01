class Solution {

    public int searchInsert(int[] nums, int target) {
        /*
         * this is done by binary search. move first and last pointers accordingly and
         * return the leftside pointer i.e. the first pointer so that if first is
         * greater than last, that means it should have first position.
         */
        int first = 0;
        int last = nums.length - 1;
        int middle;
        while (first <= last) {
            middle = first + ((last - first) / 2);
            if (nums[middle] < target) {
                first = middle + 1;
            } else if (nums[middle] > target) {
                last = middle - 1;
            } else {
                return middle;
            }
        }
        return first;
    }
}
