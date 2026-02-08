class Solution {
    public boolean searchMatrix(int[][] m, int t) {
        int r = 0, c = m[0].length - 1;
        while (r < m.length && c >= 0) {
            if (t == m[r][c]) {
                return true;
            } else if (t > m[r][c]) {
                r++;
            } else if (t < m[r][c]) {
                c--;
            }
        }
        return false;
    }
}