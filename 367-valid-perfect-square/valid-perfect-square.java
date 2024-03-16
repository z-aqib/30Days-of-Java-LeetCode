class Solution {
    public boolean isPerfectSquare(int num) {
        /*
         * so there are 2 ways. (we will do the first one)
         * one is to do a binary search from 1 to n and square the middle value and then
         * check if its equal to the num. if it is greater, move to the upper half (mid,
         * n) else to the lower half (1, mid). the breaking condition would be that 1 <=
         * num
         */

        /*
         * the other way is to find the num in term of its prime factors
         * {2,3,5,7,11,13,17,23} etc and then count how many of each, if they are even
         * it is a perfect square. BUT problem is, there are 999 prime numbers till 2^31
         * hence we would need a 1000 size array to store each prime number and then a
         * second array of 1000 size to count how many times each one occured. in worst
         * case our array would traverse 1000 times to find the divisible factor and
         * then 1000 times to count each value in the array. hence it is very very time
         * complex.
         */

        long left = 1;
        long right = num;
        long mid;
        while (left <= right) {
            mid = ((left + right) / 2);
            if (mid * mid == num) {
                return true;
            } else if (mid * mid >= num) {
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }
}