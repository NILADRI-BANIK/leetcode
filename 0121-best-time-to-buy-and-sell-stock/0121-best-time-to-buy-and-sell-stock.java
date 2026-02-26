class Solution {
    public int maxProfit(int p[]) {
        int n = p.length;
        int mv[] = new int[n];
        mv[n - 1] = p[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            mv[i] = Math.max(mv[i + 1], p[i]);
        }
        int ans = 0;
        for (int i = 0; i < p.length; i++) {
            int cp = mv[i] - p[i];
            ans = Math.max(cp, ans);
        }
        return ans;
    }
}