package Tencent;

public class No2 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] x = new int[nums1.length + nums2.length];
        int i = 0;
        int j = 0;
        int index = 0;
        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j]) {
                x[index++] = nums1[i++];
            } else {
                x[index++] = nums2[j++];
            }
        }
        while (i < nums1.length) {
            x[index++] = nums1[i++];
        }
        while (j < nums2.length) {
            x[index++] = nums2[j++];
        }
        int length = nums1.length + nums2.length;
        if (length % 2 == 1) {
            return x[length / 2];
        } else {
            return (x[length / 2] + x[length / 2 - 1]) / 2.0;
        }
    }
}
