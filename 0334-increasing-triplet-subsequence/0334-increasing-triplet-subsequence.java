class Solution {
    public boolean increasingTriplet(int[] nums) {
        int f = Integer.MAX_VALUE;
        int s = Integer.MAX_VALUE;
        int t = Integer.MAX_VALUE;
        int i, e;
        for (i = 0; i < nums.length; i++) {
            e = nums[i];
            if (f >= e) {
                f = e;
            } else if (s >= e) {
                s = e;
            } else {
                t = e;
                return true;
            }
        }
        return false;
    }
}