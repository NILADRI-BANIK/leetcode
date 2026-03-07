class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        int d, n = x, rem = 0;
        while (n > 0) {
            d = n % 10;
            rem = (rem * 10) + d;
            n = n / 10;
        }
        if (x == rem) {
            return true;
        } else {
            return false;
        }
    }
}