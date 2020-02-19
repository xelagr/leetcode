package sortsearch;

public class MergeSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1, j = n - 1, k = m + n - 1;
        while (i >= 0 && j >= 0) {
            if (nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        while (i >= 0) {
            nums1[k--] = nums1[i--];
        }
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
    }

    public void merge2(int[] nums1, int m, int[] nums2, int n) {
        int i = 0, j = 0;
        while (i < m + j && j < n) {
            if (nums1[i] <= nums2[j]) {
                i++;
            } else {
                if (m + j - i >= 0) System.arraycopy(nums1, i, nums1, i + 1, m + j - i);
                nums1[i] = nums2[j];
                i++;
                j++;
            }
        }
        while (j < n) {
            nums1[i] = nums2[j];
            i++;
            j++;
        }
    }
}
