class Solution {
    public int strStr(String haystack, String needle) {
        int index_found = -1;
        int count_of_needle = 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(count_of_needle)) {
                if (index_found == -1) {
                    index_found = i;
                }
                count_of_needle++;
            } else if (haystack.charAt(i) != needle.charAt(count_of_needle) && index_found != -1) {
                i = index_found;
                index_found = -1;
                count_of_needle = 0;
            }
            System.out.println("i-> " + i + " , index found -> " + index_found);
            if (count_of_needle == needle.length())
                break;
        }
        if (count_of_needle == needle.length())
            return index_found;
        return -1;
    }
}