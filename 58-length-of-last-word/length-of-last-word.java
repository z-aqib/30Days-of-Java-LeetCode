class Solution {
    public int lengthOfLastWord(String s) {
        /*
         * so one approach can be that to traverse from the start of the string and
         * count the length. but this takes too much time. a better approach is to
         * traverse from the end of the string and count until a space is found. remove
         * all spaces using s.trim() built in function.
         */
        s = s.trim();
        int i = s.length() - 1;
        for (; i >= 0; i--) {
            if (Character.isLetter(s.charAt(i)) == false) {
                break;
            }
        }
        return (s.length() - 1) - i;
    }
}