class Solution {
    public int singleNumber(int[] nums) {
        /*
         * so the approach is that we XOR each number with each other, the remaining is
         * the number which is single.
         * this is tested using the example [7, 3, 5, 4, 5, 3, 4] where when we will do
         * 7 ^ 3 ^ 5 ^ 4 ^ 5 ^ 3 ^ 4. XOR is exclusive OR which applies XOR gate to the
         * binary form of two numbers.
         * 7^3 = 111 ^ 011 = 100 ^ 101 (5) = 001 ^ 100 (4) = 101 ^ 101 (5) = 000 ^ 011
         * (3) = 011 ^ 100 (4) = 111 (7) where 7 is the correct answer (it is the single
         * number)
         */
        int xor_answer = 0;
        for (int i = 0; i < nums.length; i++) {
            xor_answer = xor_answer ^ nums[i];
        }
        return xor_answer;
    }
}