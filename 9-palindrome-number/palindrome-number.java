class Solution {
    public boolean isPalindrome(int x) {
        // the approach is to make x a string, and check front back both. if both are equal, return true (yes its a palindrome), if at any point front does not equal to back, return false. 
        if (x < 0) {
            return false;
        }
        String number = "" + x;
        for (int i = 0; i < number.length() / 2; i++) {
            if (number.charAt(i) != number.charAt(number.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}