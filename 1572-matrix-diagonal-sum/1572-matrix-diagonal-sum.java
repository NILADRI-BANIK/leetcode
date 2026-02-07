class Solution {
    public int diagonalSum(int[][] m) {
        int i, j, sum = 0;
        int n = m.length;
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                if (i == j || (i + j) == (n - 1)) {
                    sum = sum + m[i][j];
                }
            }
        }
        return sum;
    }
}