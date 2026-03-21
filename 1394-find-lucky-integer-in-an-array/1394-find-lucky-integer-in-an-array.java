class Solution {
    //value == frequency
    public int findLucky(int[] arr) {
        int i, n;
        int f[] = new int[1001];
        for (i = 0; i < arr.length; i++) {
            n = arr[i];
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