class Solution {
    public boolean isPalindrome(int x) {
        String number = "" + x;
        if (x < 0) {
            number = "-"+number;
        }
        for (int i = 0, j = number.length() - 1; i<j; i++, j--) {
            if (number.charAt(i) != number.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}