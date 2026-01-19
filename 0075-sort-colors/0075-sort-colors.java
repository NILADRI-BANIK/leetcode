class Solution {
    public void sortColors(int[] n) {
        int l = 0, m = 0, h = n.length - 1;
        while (m <= h) {
            if (n[m] == 0) {
                swap(n, l, m);
                l++;
                m++;
            } else if (n[m] == 1) {
                m++;
            } else {
                swap(n, m, h);
                h--;
            }
        }
    }

    public void swap(int n[], int i, int j) {
        int k = n[i];
        n[i] = n[j];
        n[j] = k;
    }
}