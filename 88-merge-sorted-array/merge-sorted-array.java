class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0)
            return;
        int m_counter = 0;
        int n_counter = 0;
        int temp;
        int n_x;
        while (m_counter < (m + n) && n_counter < n) {
            if (m_counter < m) {
                if (nums2[n_counter] < nums1[m_counter]) {
                    temp = nums1[m_counter];
                    nums1[m_counter++] = nums2[n_counter];
                    nums2[n_counter] = temp;
                    n_x = n_counter;
                    while (n_x < (n - 1) && nums2[n_x] > nums2[n_x + 1]) {
                        temp = nums2[n_x];
                        nums2[n_x] = nums2[n_x + 1];
                        nums2[n_x++ + 1] = temp;
                    }
                } else
                    m_counter++;
            } else
                nums1[m_counter++] = nums2[n_counter++];
        }
    }
}