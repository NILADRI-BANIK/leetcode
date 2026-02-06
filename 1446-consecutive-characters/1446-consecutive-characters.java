class Solution {
    public int maxPower(String s) {
        int i, m = 1, count = 1;
        for (i = 1; i < s.length(); i++) {
            char ch = s.charAt(i);
            char p = s.charAt(i - 1);

            if (ch == p) {
                count++;
            } else {
                m = Math.max(count, m);
                count = 1;
            }
        }
        m = Math.max(count, m);
        return m;
    }
}