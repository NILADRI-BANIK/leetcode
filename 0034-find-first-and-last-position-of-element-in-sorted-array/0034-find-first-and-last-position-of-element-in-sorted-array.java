class Solution {
    public int[] searchRange(int[] n, int t) {
        int ans[] = { -1, -1 };
        if (n.length == 0) {
            return ans;
        }
        ans[0] = firstvalue(n, t);
        ans[1] = secvalue(n, t);
        return ans;
    }

    public int firstvalue(int[] n, int t) {
        int m, s = 0, e = n.length - 1, ans = -1;
        while (s <= e) {
            m = (s + e) / 2;
            if (n[m] == t) {
                ans = m;
                e = m - 1;
            } else if (t > n[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return ans;
    }

    public int secvalue(int[] n, int t) {
        int m, s = 0, e = n.length - 1, ans = -1;
        while (s <= e) {
            m = (s + e) / 2;
            if (n[m] == t) {
                ans = m;
                s = m + 1;
            } else if (t > n[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return ans;
    }
}