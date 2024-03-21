class Solution {
    public int strStr(String haystack, String needle) {
        /*
         * so in this approach we get each index of haystack and create a string from
         * that index to index + needle.length(). if the string is equal to needle, it
         * means haystack contains it, return that haystack index. it will always start
         * checking for the first (zeroth) index hence it always gives first occurence
         * of needle. if no index is found after all indexes, return -1. 
         */
        for (int i = 0; i + needle.length() <= haystack.length(); i++)
            if (haystack.substring(i, i + needle.length()).equals(needle) == true)
                return i;
        return -1; // if no index returned till yet, return -1 (needle not found)
    }
}