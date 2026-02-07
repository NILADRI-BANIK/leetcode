class Solution {
    public int[][] transpose(int[][] m) {
        int i, j;
        int r = m.length;
        int c = m[0].length;
        int a[][] = new int[c][r];
        for (i = 0; i < r; i++) {
            for (j = 0; j < c; j++) {
                a[j][i] = m[i][j];
            }
        }
        return a;
    }
}