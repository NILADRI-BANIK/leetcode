class Solution {
    public int searchInsert(int[] n, int t) {
        int s = 0, e = n.length - 1, m;
        while (s <= e) {
            m = (s + e) / 2;
            if (n[m] == t) {
                return m;
            } else if (t > n[m]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return s;
    }
}