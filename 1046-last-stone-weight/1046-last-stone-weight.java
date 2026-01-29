class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for (int ele : stones) {
            pq.add(ele);
        }
        while (pq.size() > 1) {
            int max = pq.remove();
            int smax = pq.remove();

            int n = max - smax;
            if (n != 0) {
                pq.add(n);
            }
        }

        if (pq.size() == 0)

        {
            return 0;
        } else {
            return pq.remove();
        }
    }
}