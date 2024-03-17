class Solution {
    public long countSubstrings(String s, char c) {
        long counter = 0;
        int index_counter = 0;
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) == c) {
                index_counter++; 
            }
        }
        for(int i = 0; i<index_counter; i++) {
            counter+= (index_counter-i);
        }
        return counter;
    }
}