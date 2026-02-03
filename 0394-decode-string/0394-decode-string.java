class Solution {
    public String decodeString(String s) {
        Stack<Integer> n = new Stack<>();
        Stack<String> m = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= '0' && ch <= '9') {
                int n1 = 0;
                while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    n1 = n1 * 10 + (int) (s.charAt(i) - '0');
                    i++;
                }
                i--;
                n.push(n1);
            } else if (ch != ']') {
                m.push(ch + "");
            } else {
                String st = "";
                while (!m.peek().equals("[")) {
                    st = m.pop() + st;
                }
                m.pop();
                int rn = n.pop();
                StringBuilder sb = new StringBuilder("");
                while (rn > 0) {
                    sb.append(st);
                    rn--;
                }
                m.push(sb.toString());
            }
        }
        StringBuilder ans = new StringBuilder("");
        while (m.size() > 0) {
            ans.insert(0, m.pop());
        }
        return ans.toString();
    }
}