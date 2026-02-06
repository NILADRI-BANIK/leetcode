import java.util.*;

class Solution {
    public int longestConsecutive(int[] n) {

        if (n.length == 0) return 0;

        HashMap<Integer, Boolean> hm = new HashMap<>();

        for (int x : n) {
            hm.put(x, false);
        }

        // mark sequence starters
        for (int key : hm.keySet()) {
            if (!hm.containsKey(key - 1)) {
                hm.put(key, true);
            }
        }

        int max = 0;

        for (int key : hm.keySet()) {
            if (hm.get(key)) {
                int k = 1;               // ✅ reset here
                while (hm.containsKey(key + k)) {
                    k++;
                }
                max = Math.max(max, k); // ✅ store result
            }
        }

        return max;                     // ✅ correct return
    }
}
