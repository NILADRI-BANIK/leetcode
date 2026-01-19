class Solution {
    public int singleNonDuplicate(int[] n) {
        if (n.length == 1) {
            return n[0];
        } else if (n[n.length - 1] != n[n.length - 2]) {
            return n[n.length - 1];
        } else if (n[0] != n[1]) {
            return n[0];
        }

        int s = 0, e = n.length - 1, m;
        while (s <= e) {
            m = (s + e) / 2;
            if (n[m] != n[m + 1] && n[m] != n[m - 1]) {
                return n[m];
            } else if (m % 2 == 1) { //if m index is odd

                if (n[m] == n[m - 1]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            } else { //if m index is even
                if (n[m] == n[m + 1]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
        }
        return -1;
    }
}