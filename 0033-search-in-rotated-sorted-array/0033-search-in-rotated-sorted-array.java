class Solution {
    public int search(int[] n, int t) {
        int s = 0, e = n.length - 1, m;
        while (s <= e) {
            m = (s + e) / 2;
            if (n[m] == t) {
                return m;
            } else if (n[s] <= n[m]) {
                if (t >= n[s] && t < n[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            } else {
                if (t > n[m] && t <= n[e]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
        }
        return -1;
    }
}