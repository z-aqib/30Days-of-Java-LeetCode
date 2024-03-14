class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] nums3 = new int[m + n];
        int m_counter = 0;
        int n_counter = 0;
        int third_counter = 0;
        while (m_counter < m && n_counter < n) {
            if (nums1[m_counter] < nums2[n_counter]) {
                nums3[third_counter++] = nums1[m_counter++];
            } else if (nums1[m_counter] > nums2[n_counter]) {
                nums3[third_counter++] = nums2[n_counter++];
            } else {
                nums3[third_counter++] = nums1[m_counter++];
                nums3[third_counter++] = nums2[n_counter++];
            }
        }

        while (m_counter < m) {
            nums3[third_counter++] = nums1[m_counter++];
        }

        while (n_counter < n) {
            nums3[third_counter++] = nums2[n_counter++];
        }

        for(int i = 0; i < nums3.length; i++) {
            nums1[i] = nums3[i];
        }
    }
}