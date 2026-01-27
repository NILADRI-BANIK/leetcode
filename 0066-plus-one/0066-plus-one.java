class Solution {
    public int[] plusOne(int[] d) {
        int n = d.length;
        if (d[n - 1] != 9) {
            d[n - 1] = d[n - 1] + 1;
            return d;
        }
        d[n - 1] = 0;
        for (int i = n - 2; i >= 0; i--) {
            if (d[i] != 9) {
                d[i] = d[i] + 1;
                return d;
            }
            d[i] = 0;
        }
        int ans[] = new int[n + 1];
        ans[0] = 1;
        return ans;
    }
}