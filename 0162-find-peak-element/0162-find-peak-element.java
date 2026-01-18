class Solution {
    public int findPeakElement(int[] n) {
        if (n.length == 1) {
            return 0;
        } else if (n[0] > n[1]) {
            return 0;
        } else if (n[n.length - 1] > n[n.length - 2]) {
            return n.length - 1;
        } else {
            int s = 1, e = n.length - 2, m;
            while (s <= e) {
                m = (s + e )/ 2;
                if (n[m] > n[m + 1] && n[m] > n[m - 1]) {
                    return m;
                } else if (n[m + 1] > n[m]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }

        }
        return -1;
    }
}