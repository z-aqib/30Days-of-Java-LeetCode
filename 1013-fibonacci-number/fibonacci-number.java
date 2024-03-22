class Solution {
    public int fib(int n) {
        /*
         * one approach can be to make a recursive function where it returns fib(n-1) +
         * fib(n-2) as fib(n) is the sum of its previous two numbers. but this can be
         * slow as it recomputes each fib below each n multiple times repeatedly. to fix
         * this, we introduce an array which saves each fib(n) so it is calculated only
         * once. when fib(n) is re-called multiple times, it will just retreive the
         * calculated value from the array.
         */
        int[] array = new int[n+1];
        return fibonacci(n, array);
    }

    public int fibonacci(int n, int[] array) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (array[n] != 0)
            return array[n];
        array[n] = fibonacci(n - 1, array) + fibonacci(n - 2, array);
        return array[n];
    }
}