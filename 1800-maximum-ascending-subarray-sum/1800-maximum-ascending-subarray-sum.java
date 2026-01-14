class Solution {
    public int maxAscendingSum(int[] n) {
        int i, m = n[0], cm = n[0];
        for (i = 1; i < n.length; i++) {
            if (n[i - 1] < n[i]) {
                cm = cm + n[i];
            } else {
                m = Math.max(m, cm);
                cm = n[i];
            }
        }
        m = Math.max(m, cm);
        return m;
    }
}