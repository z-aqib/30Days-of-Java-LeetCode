class Solution {
    public boolean isPalindrome(int x) {
        /*
         * in this approach we flip the digits of x and then compare if they are equal
         * so if my value of x is negative, it can never be a palindrome. reject
         * immediately. then we will take a copy of x and take its last digit and
         * increment it to reverse integer each time until x finished. then we will
         * compare if they are equal
         */
        if (x < 0) {
            return false;
        }
        int temp_x = x;
        int reverse_x = 0;
        while (temp_x >= 10) {
            reverse_x = (reverse_x * 10) + temp_x % 10;
            temp_x = temp_x / 10;
        }
        reverse_x = (reverse_x * 10) + temp_x;
        return reverse_x == x;
        /*
         * another approach could be to compare each digit of x, front and back, if
         * same, move front forward and back backward until they are equal or front is
         * greater than back. if any time they are not same, reject. BUT this algorithm
         * takes more time complexity.
         */
    }
}