class Solution {
    public int[] productExceptSelf(int[] n) {
        int p = 1, l = 1, v, i;
        int x = n.length;
        int r[] = new int[x];
        for (i = x - 1; i >= 0; i--) {
            p = p * n[i];
            r[i] = p;
        }

        int a[] = new int[x];
        for (i = 0; i < x - 1; i++) {
            v = l * r[i + 1];
            a[i] = v;
            l = l * n[i];
        }
        a[x - 1] = l;
        return a;
    }
}