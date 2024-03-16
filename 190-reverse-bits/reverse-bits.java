public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        /*
         * so in this approach we take the reversed_n as 0, shift it left, add the last
         * bit of n to reverse_n, then shift n right. we do this 32 times to make sure n
         * is fully shifted for each of the 32 bits.
         * how do we add the last bit? using a bit wise OR operator (|)
         */
        int answer = 0;
        for (int i = 0; i < 32; i++) {
            answer <<= 1;
            answer = answer | (n & 1);
            n >>= 1;
        }
        return answer;
    }
}