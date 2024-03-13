class Solution {
    public int maxProduct(int[] nums) {
        // so our approach is that we want the maximum subarray which can be of any length. our subarray will stop when we encounter a 0 as the entire product would be 0. so we compute a new subarray after that
        int max_product = -10;
        int temp_product = 1;
        for(int i = 0; i < nums.length; i++) {
            temp_product = temp_product * nums[i];
            max_product = Math.max(max_product, Math.max(temp_product, nums[i]));
            if (nums[i] == 0) {
                temp_product = 1;
            }
        }
        temp_product = 1;
        for(int i = nums.length -1; i >= 0; i--) {
            temp_product = temp_product * nums[i];
            max_product = Math.max(max_product, Math.max(temp_product, nums[i]));
            if (nums[i] == 0) {
                temp_product = 1;
            }
        }
        return max_product;
    }
}