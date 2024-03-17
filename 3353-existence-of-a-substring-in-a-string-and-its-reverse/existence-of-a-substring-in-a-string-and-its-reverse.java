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
         * the string s, store them in an array of strings (possible_s) and then all
         * possible length-2-substrings of reversed string s_rev, store them in an array
         * of strings (possible_s_r) then using two for loops, compare each substring of
         * s and each substring of s_rev. get each element in each array and compare
         * using the condition:
         * if (possible_s[i].equals(possible_s_r[j]) == true ||
         * possible_s[j].equals(possible_s_r[i]) == true) ||
         * possible_s[j].equals(possible_s_r[j]) == true ||
         * possible_s[i].equals(possible_s_r[i]) == true) {return true;}
         * if after traversal of all substrings there is none same, return false;
         */
    }
}