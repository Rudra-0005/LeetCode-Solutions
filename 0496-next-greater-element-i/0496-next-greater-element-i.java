class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = -1;

            int j = 0;

            // Find nums1[i] in nums2
            while (nums2[j] != nums1[i]) {
                j++;
            }

            // Search for next greater element
            for (j = j + 1; j < m; j++) {
                if (nums2[j] > nums1[i]) {
                    ans[i] = nums2[j];
                    break;
                }
            }
        }

        return ans;
    }
}