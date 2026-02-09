class Solution {
    public int[] twoSum(int[] n, int t) {
        int a[] = new int[2];
        int i, j;
        for (i = 0; i < n.length; i++) {
            for (j = i + 1; j < n.length; j++) {
                if (n[i] + n[j] == t) {
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        return a;
    }
}