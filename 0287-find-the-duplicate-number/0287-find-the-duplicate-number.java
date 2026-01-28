class Solution {
    public int findDuplicate(int[] n) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < n.length; i++) {
            if (set.contains(n[i])) {
                return n[i];
            }
            set.add(n[i]);
        }
        return -1;
    }

}