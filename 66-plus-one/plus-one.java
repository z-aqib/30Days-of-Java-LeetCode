class Solution {
    public int[] plusOne(int[] digits) {
        return recursive(digits, digits.length - 1);
    }

    public int[] recursive(int[] digits, int n) {
        if (digits[n] != 9) {
            digits[n]++;
            for (int i = n + 1; i < digits.length; i++) {
                digits[i] = 0;
            }
            return digits;
        }
        if (n == 0) {
            int[] d = new int[digits.length + 1];
            d[0] = 1;
            System.out.println("done");
            return d;
        }
        return recursive(digits, n - 1);
    }
}