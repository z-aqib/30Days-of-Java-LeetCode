class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int m_counter = 0;
        int n_counter = 0;
        int temp;
        while (m_counter < (m + n) && n_counter < n) {
            int n_x = n_counter;
            while (n_x < n - 1 && nums2[n_x] > nums2[n_x + 1]) {
                temp = nums2[n_x];
                nums2[n_x] = nums2[n_x + 1];
                nums2[n_x + 1] = temp;
                n_x++;
            }
            if (m_counter < m) {
                if (n_counter < n - 1 && nums2[n_counter] > nums2[n_counter + 1]) {
                    temp = nums2[n_counter];
                    nums2[n_counter] = nums2[n_counter + 1];
                    nums2[n_counter + 1] = temp;
                }
                if (nums2[n_counter] < nums1[m_counter]) {
                    temp = nums1[m_counter];
                    nums1[m_counter++] = nums2[n_counter];
                    nums2[n_counter] = temp;
                } else {
                    m_counter++;
                }
            } else {
                nums1[m_counter++] = nums2[n_counter++];
            }
        }
    }
}