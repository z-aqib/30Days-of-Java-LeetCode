class Solution {
    public boolean containsDuplicate(int[] nums) {
        /*
         * so a very easy approach can be that we sort the array using Arrays.sort(nums)
         * and then compare each neighbouring element with each other for duplicates.
         * BUT in sorting it has time complexity O(n^2) making it very slower.
         * another approach can be that we maintain a hashtable (a hashset uses lesser
         * memory) which saves a position for each unique value. if a second value
         * occurs, meaning a duplicate is found, it returns false.
         * BUT, in the first approach, little to no memory is used while in the second
         * approach alot of memory is used, in worst case, if all elements are unique,
         * O(n) space complexity.
         */
        Set<Integer> hashTable = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashTable.add(nums[i]) == false)
                return true;
        }
        return false;
    }
}