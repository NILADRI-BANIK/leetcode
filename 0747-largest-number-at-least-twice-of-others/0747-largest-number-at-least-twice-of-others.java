class Solution {
    public int dominantIndex(int[] a) {
        int max = -1, smax = -1, i, maxi = 0;
        for (i = 0; i < a.length; i++) {
            if (max < a[i]) {
                smax = max;
                max = a[i];
                maxi = i;
            } else if (smax < a[i]) {
                smax = a[i];
            }
        }
        if (smax * 2 <= max) {
            return maxi;
        } else {
            return -1;
        }
    }
}