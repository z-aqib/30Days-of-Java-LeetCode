class Solution {
    public int strStr(String haystack, String needle) {
        for (int i = 0; i + needle.length() <= haystack.length(); i++) {
            if (haystack.substring(i, i + needle.length()).equals(needle) == true)
                return i;
        }
        if (haystack.equals(needle) == true)
            return 0;
        return -1;
    }
}