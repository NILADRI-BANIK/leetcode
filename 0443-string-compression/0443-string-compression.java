class Solution {
    public int compress(char[] cha) {
        int i, count = 1;
        StringBuilder sb = new StringBuilder("");
        sb.append(cha[0]);
        for (i = 1; i < cha.length; i++) {
            if (cha[i - 1] != cha[i]) {
                if (count > 1) {
                    sb.append(count + "");
                }
                sb.append(cha[i]);
                count = 1;
            } else {
                count++;
            }
        }
        if (count > 1) {
            sb.append(count + "");
        }
        for (i = 0; i < sb.length(); i++) {
            char ch = sb.charAt(i);
            cha[i] = ch;

        }
        return sb.length();
    }
}