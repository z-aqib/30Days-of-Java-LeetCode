class Solution {
    public int singleNumber(int[] nums) {
        Integer[] seen = new Integer[nums.length];
        for (int i = 0; i<nums.length; i++){
            seen = edit(seen, nums[i]);
        }
        // now at the end, we have an array which has only 1 value
        // that value left is our single element
        for(int i = 0; i<seen.length; i++){
            if(seen[i] !=null){
                return seen[i];
            }
        }
        return 0;
    }

    public Integer[] edit(Integer[] seen, int checking) {
        int index = contains(seen, checking);
        if (index != -1) {
            seen = remove(seen, checking, index);
        } else {
            seen = add(seen, checking);
        }
        return seen;
    }

    public int contains(Integer[] array, int check) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && check == array[i]) {
                return i;
            }
        }
        return -1;
    }

    public Integer[] add(Integer[] array, int adding){
        boolean placed = false;
        for(int i = 0; i<array.length && placed == false; i++){
            if (array[i] == null){
                array[i] = adding;
                placed = true;
            }
        }
        return array;
    }

    public Integer[] remove (Integer[] array, int removing, int index){
        if (index >= 0) {
            array[index] = null;
        }
        return array;
    }

}