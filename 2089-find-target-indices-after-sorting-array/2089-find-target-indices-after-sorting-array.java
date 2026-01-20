class Solution {
    public List<Integer> targetIndices(int[] n, int t) {
        Arrays.sort(n);

        List<Integer> ans = new ArrayList<>();
        for (int i = 0; i < n.length; i++) {
            if (n[i] == t) {
                ans.add(i);
            }
        }
        return ans;
    }
}