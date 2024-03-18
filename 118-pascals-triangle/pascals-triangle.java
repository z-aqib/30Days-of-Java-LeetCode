class Solution {
    public List<List<Integer>> generate(int numRows) {
        /*
         * so the approach is that we use arrays and then convert them to lists. so we
         * declare a currentRow array of size i+1 as for each row number, thats how many
         * elements there are. then we intialize the first and last elements as 1. then,
         * we get the first index and run a for-loop (it will not run for rows 1 and 2
         * as for-loop condition is not satisfied) and it would add the zeroth and first
         * index of the previous row. then for the second index it would add the first
         * and second index of previous row. and so on until the second last index (last
         * index has already been intialized). then it would convert the array to a list
         * and add to pascals_triangle.
         */
        List<List<Integer>> pascals_triangle = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            Integer[] currentRowTriangle = new Integer[i + 1];
            currentRowTriangle[0] = 1;
            currentRowTriangle[currentRowTriangle.length - 1] = 1;
            for (int j = 1; j < currentRowTriangle.length - 1; j++) {
                currentRowTriangle[j] = pascals_triangle.get(i - 1).get(j) + pascals_triangle.get(i - 1).get(j - 1);
            }
            pascals_triangle.add(Arrays.asList(currentRowTriangle));
        }
        return pascals_triangle;
    }
}