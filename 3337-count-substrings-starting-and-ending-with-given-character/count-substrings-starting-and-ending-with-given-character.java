class Solution {
    public long countSubstrings(String s, char c) {
        /*
         * so the approach is that we first count how many character c there are in the
         * string s, and then we use the sum of natural numbers formula n(n+1)/2 to
         * calculate how many substrings there are. this formula is used because a
         * pattern was forming (when c=3, substrings=6)(when c=4, substrings=10)(when
         * c=5, substrings=15) hence pattern is 6,10,15.
         */
        long character_counter = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                character_counter++;
            }
        }
        return character_counter * (character_counter + 1) / 2;
    }
}