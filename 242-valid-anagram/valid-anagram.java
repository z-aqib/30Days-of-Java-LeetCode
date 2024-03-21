class Solution {
    public boolean isAnagram(String s, String t) {
        /*
        
        */
        if (s.length() != t.length())
            return false;
        int[] character_count = new int[26];
        for (int i = 0; i < s.length(); i++)
            character_count[(int) s.charAt(i) - 97]++;
        for (int i = 0; i < t.length(); i++)
            character_count[(int) t.charAt(i) - 97]--;
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