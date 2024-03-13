class Solution {
    public int singleNumber(int[] nums) {
        // so our approach is that we create an array of half size of nums, and we add each nums[i] to that array. when we encounter an already added number in the array, we remove it to signify that that number has found its repeating partner. when all the numbers in nums have been traversed, there will be only one value remaining in the extra array - that is my single number. 
        
        Integer[] seen = new Integer[(nums.length/2) + 1]; // so if i have one value in nums, one value in seen. 
        for (int i = 0; i < nums.length; i++){
            seen = edit(seen, nums[i]);
        }

        // now at the end, we have an array which has only 1 value and that value left is our single element

        for(int i = 0; i < seen.length; i++){
            if(seen[i] != null){
                return seen[i];
            }
        }
        return 0; 
    }

    public Integer[] edit(Integer[] seen, int checking) {
        // so first we run the seen array and check, does the value nums[i] already exist (contain) in seen array? if yes, then remove it. if not, then add it. 

        int index = contains(seen, checking);
        if (index != -1) {
            seen[index] = null; // REMOVE IT
        } else {
            // ADD IT
            for(int i = 0; i < seen.length; i++){
                if (seen[i] == null) { // add nums[i] on the first empty index found. 
                    seen[i] = checking;
                    break;
                }
            }
        }
        return seen;
    }

    public int contains(Integer[] array, int check) {
        // to check if the array contains a specific value, traverse it and check each value. if it is not null and we encounter the value, return its index. if at the end of the traversal we do not find the said value, then return index as -1 to signify it was not found. 

        for (int i = 0; i < array.length; i++) {
            if (array[i] != null && check == array[i]) {
                return i;
            }
        }
        return -1;
    }

}