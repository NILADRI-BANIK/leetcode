class Solution {
    public int findMin(int[] n) {
        if (n.length == 1) {
            return n[0];
        } else if (n[0] < n[n.length - 1]) {
            return n[0];
        }
        int s = 0, e = n.length - 1, m;
        while (s <= e) {
            m = (s + e) / 2;
            if (m != 0 && n[m - 1] > n[m]) {
                return n[m];
            } else if (m != n.length - 1 && n[m] > n[m + 1]) {
                return n[m + 1];
            } else if (n[s] <= n[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }
}