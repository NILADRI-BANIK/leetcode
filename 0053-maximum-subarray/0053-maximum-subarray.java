class Solution {
    public int maxSubArray(int[] n) {
        int c = n[0], m = n[0], i;
        for (i = 1; i < n.length; i++) {
            if (c + n[i] > n[i]) {
                c = c + n[i];
            } else {
                c = n[i];
            }
            m = Math.max(m, c);
        }
        return m;
    }
}