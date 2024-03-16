class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        /*
         * so if i start from front and merge from there, then it takes 2ms which is
         * only 7% of other users (its taking too much time), this is because when we
         * merge we have to sort multiple times the nums2 array. hence it is time
         * complex. lets try it from back merging.
         * so the approach is that we start a pointer of merged array from the last
         * element and take elemnts from nums1 and nums2 (whichever is bigger)
         * respectively. if one array has been completed, copy the second array's
         * normally; to save memory, use m and n as nums1 and nums2 pointers. 
         */
        int m_pointer = nums1.length - 1;
        while (m_pointer >= 0 && (n - 1) >= 0 && (m - 1) >= 0) {
            if (nums1[m - 1] > nums2[n - 1]) {
                nums1[m_pointer--] = nums1[m-- - 1];
            } else {
                nums1[m_pointer--] = nums2[n-- - 1];
            }
        }
        // if any elements from n are left, copy them into nums1 (m_pointer places)
        while ((n - 1) >= 0) {
            nums1[m_pointer--] = nums2[n-- - 1];
        }
        // if any elemnts from m are left, then they already exist, no need to copy
    }
}