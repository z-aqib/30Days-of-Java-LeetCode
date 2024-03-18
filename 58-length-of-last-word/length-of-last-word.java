class Solution {
    public int lengthOfLastWord(String s) {
        int word_length = 0;
        if (Character.isLetter(s.charAt(0)) == true) {
            word_length++;
        }
        for (int i = 1; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i)) == true && s.charAt(i - 1) == ' ') {
                word_length = 1;
            } else if (Character.isLetter(s.charAt(i)) == true
                    && Character.isLetter(s.charAt(i - 1)) == true) {
                word_length++;
            }
        }
        return word_length;
    }
}