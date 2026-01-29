class Solution {
    public int pivotIndex(int[] n) {
        int rsum = 0, lsum = 0, i;
        for (i = 0; i < n.length; i++) {
            rsum = rsum + n[i];
        }
        for (i = 0; i < n.length; i++) {
            rsum = rsum - n[i];

            if (rsum == lsum) {
                return i;
            }
            lsum = lsum + n[i];
        }
        return -1;
    }

}
