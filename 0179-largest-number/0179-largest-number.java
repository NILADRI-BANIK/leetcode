class Solution {
    public String largestNumber(int[] n) {
        String a[] = new String[n.length];

        for (int i = 0; i < n.length; i++) {
            a[i] = n[i] + "";
        }
        Arrays.sort(a, (s1, s2) -> (s1 + s2).compareTo(s2 + s1));
        StringBuilder sb = new StringBuilder("");
        for (int i = a.length - 1; i >= 0; i--) {
            sb.append(a[i]);
        }

        if (sb.charAt(0) == '0') {
            return "0";
        }

        return sb.toString();
    }
}