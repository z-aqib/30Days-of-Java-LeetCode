class Solution {
    public boolean isAnagram(String s, String t) {
        /*
         * so in this approach we created an array of size 26 where each index
         * represents 'a' for 0, 'b' for 1, ... , 'z' for 25. if s and t's length are
         * not equal, return false immediately as letters count wont be same so no need
         * to check the string. then get each character of s and increment its count in
         * character_count array of 26 size. then get each character of t and decrement
         * its count (to show its used) of each character_count. then check each
         * character's count and if any are not 0 (positive means s has it but t doesnt
         * and negative means t has it but s doesnt) then return false; if all are 0,
         * return true. a small check can be applied when we decrement t's character
         * counts that if any get negative, return false immediately as it is using
         * extra letters that s doesnt have.
         */
        if (s.length() != t.length())
            return false;
        int[] character_count = new int[26];
        for (int i = 0; i < s.length(); i++)
            character_count[(int) s.charAt(i) - 97]++;
        for (int i = 0; i < t.length(); i++) {
            character_count[(int) t.charAt(i) - 97]--;
            if (character_count[(int) t.charAt(i) - 97] < 0)
                return false;
        }
        for (int i = 0; i < character_count.length; i++)
            if (character_count[i] != 0)
                return false;
        return true;
        /*
         * one approach can be that we can use a hash table to count each letter for
         * string s and then deduct each letter in string t and if any letters are
         * negative or positive, return false.
         */
    }
}