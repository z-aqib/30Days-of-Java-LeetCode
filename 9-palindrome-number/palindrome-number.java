class Solution {
    public boolean isPalindrome(int x) {
        // the approach is to make x a string, and check front back both. if both are equal, return true (yes its a palindrome), if at any point front does not equal to back, return false. 
        String number = "" + x;
        for (int i = 0, j = number.length() - 1; i < j; i++, j--) {
            if (number.charAt(i) != number.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}