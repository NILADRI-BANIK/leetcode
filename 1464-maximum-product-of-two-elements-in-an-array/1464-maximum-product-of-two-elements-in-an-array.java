class Solution {
    public int maxProduct(int[] nums) {
        int max = -1, smax = -1, i, ans;
        for (i = 0; i < nums.length; i++) {
            if (max < nums[i]) {
                smax = max;
                max = nums[i];
            } else if (smax < nums[i]) {
                smax = nums[i];
            }
        }
        ans = (max - 1) * (smax - 1);
        return ans;
    }
}