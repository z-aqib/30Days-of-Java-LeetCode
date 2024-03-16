class Solution {
    public int romanToInt(String s) {
        /*
         * simple approach: check each character in s and assign its digit_value
         * according to what letter it is (table is given in the question) then add it
         * to the total_value
         */
        int total_value = 0;
        int digit_value = 0;
        for (int i = 0; i < s.length(); i++) {
            char letter = s.charAt(i);
            switch (letter) {
                case 'I' -> {
                    if (i != s.length() - 1 && (s.charAt(i + 1) == 'V' || s.charAt(i + 1) == 'X'))
                        digit_value = -1;
                    else
                        digit_value = 1;
                }
                case 'V' ->
                    digit_value = 5;
                case 'X' -> {
                    if (i != s.length() - 1 && (s.charAt(i + 1) == 'L' || s.charAt(i + 1) == 'C'))
                        digit_value = -10;
                    else
                        digit_value = 10;
                }
                case 'L' ->
                    digit_value = 50;
                case 'C' -> {
                    if (i != s.length() - 1 && (s.charAt(i + 1) == 'D' || s.charAt(i + 1) == 'M'))
                        digit_value = -100;
                    else
                        digit_value = 100;
                }
                case 'D' ->
                    digit_value = 500;
                case 'M' ->
                    digit_value = 1000;
            }
            total_value += digit_value;
        }
        return total_value;
    }
}