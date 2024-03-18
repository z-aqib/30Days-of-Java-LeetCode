class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascals_triangle = new ArrayList<>();
        Integer[] previousRowTriangle = {1};
        for (int i = 0; i < numRows; i++) {
            Integer[] currentRowTriangle = new Integer[i + 1];
            currentRowTriangle[0] = 1;
            currentRowTriangle[currentRowTriangle.length - 1] = 1;
            if ((i + 1) > 2) {
                for (int j = 1; j < currentRowTriangle.length - 1; j++) {
                    currentRowTriangle[j] = previousRowTriangle[j] + previousRowTriangle[j - 1];
                }
            }
            pascals_triangle.add(Arrays.asList(currentRowTriangle));
            previousRowTriangle = currentRowTriangle;
        }
        return pascals_triangle;
    }
}