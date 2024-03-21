class Solution {
    public int getSum(int a, int b) {
        /*
         * so in this approach we calculate the sum and carry of a and b and then re
         * calculate it iteratively on the new values of a and b (a is sum and b is
         * carry) and then continue calculating until b (carry) is 0.
         * we calculate sum using XOR gate on a, b (a ^ b)
         * we calculate carry using (a AND b) and then we shift left this value by 1
         */
        int sum;
        int carry;
        while (b != 0) {
            sum = a ^ b;
            carry = (a & b) << 1;
            a = sum;
            b = carry;
        }
        return a;
    }
}