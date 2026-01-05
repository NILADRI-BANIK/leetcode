class Solution {
    public int tribonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int i, ft = 0, st = 1, tt = 1, fot;
        for (i = 1; i <= n; i++) {
            fot = ft + st + tt;

            ft = st;
            st = tt;
            tt = fot;
        }
        return ft;
    }
}