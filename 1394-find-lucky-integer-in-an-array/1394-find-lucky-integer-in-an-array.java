class Solution {
    public int findLucky(int[] arr) {
        int i;
        int f[] = new int[1001];
        for (int n : arr) {
            f[n]++;
        }
        for (i = 1000; i >= 1; i--) {
            if (f[i] == i) {
                return i;
            }
        }
        return -1;
    }
}