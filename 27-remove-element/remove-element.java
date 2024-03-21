class Solution {
    public int removeElement(int[] nums, int val) {
        /*
         * so the approach used is that we check each nums[i] and then see if its equal
         * to the value we are looking for, we increase moving_length by 1 and intialise
         * nums[i] as nums[i+1]. then we recheck nums[i] again, if it is again value,
         * then increment moving_length again and intialise it as nums[i] as nums[i+2].
         * now recheck nums[i] again and if it is not the value, then move i one ahead.
         * now the next nums[i] is exmaple not the value so it is declared nums[i+2] as
         * 2 values before the current i have been removed so we need to increment it
         * two places. this continues until the end of the array, then the total no of
         * elements - the number of elements removed is equal to the remaining elements.
         */
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