class Solution {
    public int trap(int[] h) {
        int i, ans = 0, n = h.length;
        int l[] = new int[n];
        l[0] = h[0];
        for (i = 1; i < n; i++) {
            l[i] = Math.max(l[i - 1], h[i]);
        }

        int r[] = new int[n];
        r[n - 1] = h[n - 1];
        for (i = n - 2; i >= 0; i--) {
            r[i] = Math.max(r[i + 1], h[i]);
        }

        for (i = 0; i < n; i++) {
            ans = ans + (Math.min(l[i], r[i]) - h[i]);
        }
        return ans;
    }
}