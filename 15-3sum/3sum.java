class Solution {

    public List<List<Integer>> threeSum(int[] nums) {
        /*
         * so an approach can be that we take each index, put three for loops, get the
         * ith, i+1th, i+2th index and compute sum, if 0, add this combination to list
         * then move to the ith, i+1th, i+3th combination. but problem is there are
         * repitions in this code AND the time complexity is n^3 which is very very
         * high.
         * a second approach is to first sort the array and then get a value, get the
         * ith and the i+1th (minimum value) and the (len-1)th value (maximum value).
         * now if our sum of this combination is greater than zero, that means our
         * maximum value is too high. decremenet the second pointer. if our sum is
         * lesser than zero, that means our minimum value is too low. increment the
         * first pointer. if the sum is zero, add this combination normally. to skip
         * duplicates, we will add if conditions that if the previous element is same as
         * the current element, ignore this entire computation.
         */
        List<List<Integer>> list = new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            // if the previous is equal to current, its a duplicate, ignore.
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }
            int first_pointer = i + 1;
            int second_pointer = nums.length - 1;
            while (first_pointer < second_pointer) {
                int sum = nums[i] + nums[first_pointer] + nums[second_pointer];
                if (sum == 0) {
                    List<Integer> triplet = new ArrayList<Integer>();
                    triplet.add(nums[i]);
                    triplet.add(nums[first_pointer]);
                    triplet.add(nums[second_pointer]);
                    list.add(triplet);
                    // now skip all the duplicates of first_pointer
                    while (first_pointer < second_pointer
                            && nums[first_pointer] == nums[first_pointer + 1]) {
                        first_pointer++;
                    }
                    // now move one value ahead as we have computed this one
                    first_pointer++;
                    // now skip all the duplicates of the second_pointer
                    while (first_pointer < second_pointer
                            && nums[second_pointer] == nums[second_pointer - 1]) {
                        second_pointer--;
                    }
                    // now move one value ahead
                    second_pointer--;
                } else if (sum > 0) {
                    // sum is too high, decrease the maximum value to get closer to zero
                    second_pointer--;
                } else {
                    // sum is too low, increase the minimum value to get closer to zero
                    first_pointer++;
                }
            }
        }
        return list;
    }
}
