class Solution {
    public int[][] generateMatrix(int n) {
        int a[][] = new int[n][n];
        int r, c, minRow = 0, maxRow = n - 1, minCol = 0, maxCol = n - 1, count = 1;

        while (count <= n * n) {
            //minRow fix (minCol --> maxCol)
            for (c = minCol; c <= maxCol; c++) {
                a[minRow][c] = count;
                count++;
            }
            //maxCol fix (minRow --> maxRow)
            for (r = minRow + 1; r <= maxRow; r++) {
                a[r][maxCol] = count;
                count++;
            }
            //maxRow fix (maxCol-1 --> minCol)
            for (c = maxCol - 1; c >= minCol; c--) {
                a[maxRow][c] = count;
                count++;
            }
            //minCol fix (maxRow-1 --> minRow+1)
            for (r = maxRow - 1; r >= minRow + 1; r--) {
                a[r][minCol] = count;
                count++;
            }
            maxRow--;
            minRow++;
            maxCol--;
            minCol++;
        }
        return a;
    }
}