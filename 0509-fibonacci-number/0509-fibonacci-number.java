class Solution {
    public int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        }

        int i, ft = 0, st = 1, tt;
        for (i = 2; i <= n; i++) {
            tt = ft + st;

            ft = st;
            st = tt;
        }
        return st;
    }
}