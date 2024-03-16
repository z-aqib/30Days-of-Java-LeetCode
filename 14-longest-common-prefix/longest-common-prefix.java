class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = strs[0];
        for (int i = 1; i<strs.length; i++) {
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