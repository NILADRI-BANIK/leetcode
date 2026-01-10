class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int pro = 1, i;
        int r[] = new int[n];
        for (i = n - 1; i >= 0; i--) {
            pro = pro * nums[i];
            r[i] = pro;
        }
        int a[] = new int[n];
        int l = 1, val = 1;
        for (i = 0; i < n - 1; i++) {
            val = l * r[i + 1];
            a[i] = val;
            l = l * nums[i];
        }
        a[n - 1] = l;
        return a;
    }
}