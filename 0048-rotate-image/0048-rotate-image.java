class Solution {
    public void rotate(int[][] m) {
        int i, j, n = m.length, k;
        for (i = 0; i < n; i++) {
            for (j = i; j < n; j++) {
                k = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = k;
            }
        }

        for (i = 0; i < n; i++) {
            int t[] = m[i];
            reverse(t);
        }
        return;
    }

    public void reverse(int a[]) {
        int s = 0, e = a.length - 1, k;
        while (s <= e) {
            k = a[s];
            a[s] = a[e];
            a[e] = k;
            s++;
            e--;
        }
    }
}