class Solution {
    public int missingNumber(int[] nums) {
        int r = nums.length;
        int ac, cc = 0, i;
        ac = (r * (r + 1)) / 2;
        for (i = 0; i < nums.length; i++) {
            cc = cc + nums[i];
        }
        return ac - cc;
    }

}