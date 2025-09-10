class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        
                 // Ensure nums1 is the smaller array (binary search on smaller array)
        if (nums1.length > nums2.length) {
            return findMedianSortedArrays(nums2, nums1);
        }

        int m = nums1.length, n = nums2.length;
        int low = 0, high = m;
        int half = (m + n + 1) / 2; // left side size (odd case: left has one extra)

        while (low <= high) {
            int i = (low + high) / 2;   // cut in nums1
            int j = half - i;           // cut in nums2

            int leftA  = (i == 0) ? Integer.MIN_VALUE : nums1[i - 1];
            int rightA = (i == m) ? Integer.MAX_VALUE : nums1[i];
            int leftB  = (j == 0) ? Integer.MIN_VALUE : nums2[j - 1];
            int rightB = (j == n) ? Integer.MAX_VALUE : nums2[j];

            if (leftA <= rightB && leftB <= rightA) { // perfect partition
                if ((m + n) % 2 == 1) {
                    return Math.max(leftA, leftB); // odd
                } else {
                    return (Math.max(leftA, leftB) + Math.min(rightA, rightB)) / 2.0; // even
                }
            } else if (leftA > rightB) {
                high = i - 1; // i is too big, move left
            } else {
                low = i + 1;  // i is too small, move right
            }
        }

        // Should never reach here for valid inputs
        throw new IllegalArgumentException("Input arrays are not valid.");

    }
}