class Solution {
    public int mySqrt(int x) {
        long min_pointer = 1;
        long max_pointer = x;
        long middle_value;
        long middle_square;
        while (min_pointer <= max_pointer) {
            middle_value = (max_pointer + min_pointer) / 2;
            middle_square = middle_value * middle_value;
            if (middle_square == x)
                return (int) middle_value;
            else if (middle_square > x)
                max_pointer = middle_value - 1;
            else
                min_pointer = middle_value + 1;
        }
        return (int) max_pointer;
    }
}