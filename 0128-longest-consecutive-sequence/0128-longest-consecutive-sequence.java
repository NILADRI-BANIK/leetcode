class Solution {
    public int longestConsecutive(int[] n) {

        if (n.length == 0) {
            return 0;
        }
        HashMap<Integer, Boolean> hm = new HashMap<>();

        for (int x : n) {
            hm.put(x, false);
        }

        for (int key : hm.keySet()) {
            if (hm.containsKey(key - 1) == false) {
                hm.put(key, true);
            }
        }

        int max = 0;

        for (int key : hm.keySet()) {
            if (hm.get(key) == true) {
                int k = 1;
                while (hm.containsKey(key + k) == true) {
                    k++;
                }
                max = Math.max(max, k);
            }
        }

        return max;
    }
}
