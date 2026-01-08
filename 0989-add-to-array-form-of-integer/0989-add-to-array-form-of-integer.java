class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        int p = num.length - 1, carry = 0, nav = 0;
        List<Integer> ans = new ArrayList<>();
        while (p >= 0 || k > 0) {
            if (p >= 0) {
                nav = num[p];
            } else {
                nav = 0;
            }

            int d = k % 10;
            int sum = carry + d + nav;
            int di = sum % 10;
            carry = sum / 10;
            ans.add(di);
            p--;
            k = k / 10;
        }
        if (carry > 0) {
            ans.add(carry);
        }

        Collections.reverse(ans);
        return ans;
    }
}