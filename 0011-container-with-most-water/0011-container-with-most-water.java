class Solution {
    public int maxArea(int[] height) {
        int s = 0, h, w, c, mc = 0, e = height.length - 1;
        while (s < e) {
            h = Math.min(height[s], height[e]);
            w = e - s;
            c = h * w;
            mc = Math.max(c, mc);
            if (height[s] < height[e]) {
                s++;
            } else {
                e--;
            }
        }
        return mc;
    }
}