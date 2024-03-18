class Solution {
    public int lengthOfLastWord(String s) {
        /*
         * so one approach can be that to traverse from the start of the string and
         * count the length. but this takes too much time. a better approach is to
         * traverse from the end of the string and count until a space is found.
         */
        s = s.trim();
        int word_length = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isLetter(s.charAt(i)) == true) {
                word_length++;
            } else {
                break;
            }
        }
        return word_length;
    }
}