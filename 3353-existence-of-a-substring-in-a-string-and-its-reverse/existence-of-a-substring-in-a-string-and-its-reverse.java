class Solution {
    public boolean isSubstringPresent(String s) {
        /*
         * so the approach is that we create reversed string of s (s_reversed) and then
         * we get each substring of s_reversed of length-2 and check if it is contained
         * in s. if yes, return true. if all substrings of s_reversed are computed and s
         * does not contain them, return false.
         */
        String s_reversed = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            s_reversed = s_reversed + s.charAt(i);
        }
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.contains(s_reversed.substring(i, i + 2)) == true) {
                return true;
            }
        }
        return false;
        /*
         * one approach can be that, that we compute all possible length-2-substrings of
         * the string s and then all possible length-2-substrings of reversed string
         * s_rev, then using two for loops, compare each substring of s and each
         * substring of s_rev. whenver any are equal, return true.
         * String[] pairs_of_s = new String[s.length()-1];
         * for(int i = 0; i<pairs_of_s.length; i++){
         * pairs_of_s[i] = s.substring(i, i+2);
         * }
         * // s_reversed can be computed by getting the characters of s from the end
         * String[] pairs_of_s_r = new String[s.length()-1];
         * for(int i = 0; i<pairs_of_s_r.length; i++){
         * pairs_of_s_r[i] = s_reversed.substring(i, i+2);
         * }
         * for(int i = 0; i<pairs_of_s.length; i++) {
         * if (pairs_of_s[i].equals(pairs_of_s_r[i]) == true) return true;
         * for(int j = i+1; j<pairs_of_s.length; j++) {
         * if (pairs_of_s[i].equals(pairs_of_s_r[j]) == true
         * || pairs_of_s[j].equals(pairs_of_s_r[i]) == true
         * || pairs_of_s[j].equals(pairs_of_s_r[j]) == true)
         * return true;
         * }
         * }
         */
    }
}