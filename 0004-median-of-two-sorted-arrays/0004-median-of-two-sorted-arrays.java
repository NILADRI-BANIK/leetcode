class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] ans = merge(nums1, nums2);
        int n = ans.length;
        if (n % 2 == 0) {
            return (ans[n / 2 - 1] + ans[n / 2]) / 2.0;
        } else {
            return ans[n / 2];
        }
    }

    public int[] merge(int arr1[], int arr2[]) {
        int ans[] = new int[arr1.length + arr2.length];
        int p1 = 0, p2 = 0, p3 = 0;
        while (p1 < arr1.length || p2 < arr2.length) {
            int v1 = p1 < arr1.length ? arr1[p1] : Integer.MAX_VALUE;
            int v2 = p2 < arr2.length ? arr2[p2] : Integer.MAX_VALUE;
            if (v1 < v2) {
                ans[p3] = v1;
                p1++;
            } else {
                ans[p3] = v2;
                p2++;
            }
            p3++;
        }
        return ans;
    }
}
