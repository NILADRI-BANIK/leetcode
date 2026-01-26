class Solution {
    public int maximumCount(int[] n) {
        int l = lneg(n) + 1;
        int f = n.length - fpos(n);
        return Math.max(l, f);
    }

    public int lneg(int[] n) {
        int s = 0, e = n.length - 1, ans = -1, m;
        while (s <= e) {
            m = (s + e) / 2;
            if (n[m] < 0) {
                ans = m;
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return ans;
    }

    public int fpos(int[] n) {
        int s = 0, e = n.length - 1, ans = n.length , m;
        while (s <= e) {
            m = (s + e) / 2;
            if (n[m] > 0) {
                ans = m;
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return ans;
    }
}