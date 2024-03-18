class Solution {
    public int mySqrt(int x) {
        /*
         * so the approach is that we use binary search on finding the sqrt of x. what
         * we do is that we start from range [1, x]. we find the middle, check if its
         * the sqrt(x), if yes, return middle, else if the middle's square is greater
         * than x, then we move to the [1, middle] range as our middle is too high, but
         * if the middle's square is lesser than x, then we move to the [middle, x/2]
         * range as our middle is too low. we compute until our range gets nil. then we
         * return the right side of the range (max_pointer) as it would be rounded down.
         * this is because when the while loop breaks, it breaks when min_pointer is
         * greater than max_pointer. hence max_pointer is the LOWER value and that
         * should be returned.
         */
        long min_pointer = 1;
        long max_pointer = x;
        long middle_value;
        while (min_pointer <= max_pointer) {
            middle_value = (max_pointer + min_pointer) / 2;
            if (middle_value * middle_value == x)
                return (int) middle_value;
            else if (middle_value * middle_value > x)
                max_pointer = middle_value - 1;
            else
                min_pointer = middle_value + 1;
        }
        return (int) max_pointer;
    }
}