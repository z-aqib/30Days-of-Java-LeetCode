class Solution {
    public boolean isPalindrome(int x) {
        // in this approach we flip the digits of x and then compare if they are equal

        // so if my value of x is negative, it can never be a palindrome. reject immediately. 
        if (x < 0) {
            return false;
        }

        // now we will take a copy of x and take its last digit and increment it to reverse integer each time until x finished. then we will compare if they are equal
        int temp_x = x;
        int reverse_x = 0;

        while (temp_x >= 10) {
            int last_digit = temp_x % 10;
            reverse_x = (reverse_x * 10) + last_digit;
            temp_x = temp_x / 10;
        }
        reverse_x = (reverse_x * 10) + temp_x;
        return reverse_x == x;


        /*
        // the approach is to make x a string, and check front back both. if both are equal, return true (yes its a palindrome), if at any point front does not equal to back, return false. 
        String number = "" + x;
        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - i - 1)) {
                return false;
            }
        }
        return true;
        */
    }
}