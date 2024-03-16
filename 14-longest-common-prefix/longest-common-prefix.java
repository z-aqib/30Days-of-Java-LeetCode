class Solution {
    public String longestCommonPrefix(String[] strs) {
        /*
         * so the approach is that prefix is the first string. now we get the second
         * string, match each of its letters with prefix, if we find an unmatch, we make
         * prefix till BEFORE that un-match. but if we do not find any un-matches AND
         * the second string is smaller than the prefix, then prefix becomes the second
         * string. then we get the next string and repeat.
         */
        String prefix = strs[0];
        for (int i = 1; i < strs.length; i++) {
            String str_to_match = strs[i];
            boolean matched = true;
            for (int j = 0; j < str_to_match.length() && j < prefix.length(); j++) {
                if (str_to_match.charAt(j) != prefix.charAt(j)) {
                    prefix = prefix.substring(0, j);
                    matched = false;
                }
            }
            if (matched == true && prefix.length() > str_to_match.length()) {
                prefix = str_to_match;
            }
        }
        return prefix;
    }
}