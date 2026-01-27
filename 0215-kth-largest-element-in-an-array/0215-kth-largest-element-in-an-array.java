class Solution {
    public int findKthLargest(int[] n, int k) {
        PriorityQueue<Integer> pr = new PriorityQueue<>();
        for (int i = 0; i < n.length; i++) {
            if (pr.size() < k) {
                pr.add(n[i]);
            } else if (pr.peek() < n[i]) {
                pr.remove();
                pr.add(n[i]);
            }
        }
        return pr.peek();
    }
}