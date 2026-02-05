class Solution {
    public String removeDuplicateLetters(String s) {
        int i, ind;
        int li[] = new int[26];
        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            ind = (int) (ch - 'a');
            li[ind] = i;
        }

        boolean p[] = new boolean[26];
        Stack<Character> st = new Stack<>();
        for (i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            ind = (int) (ch - 'a');

            if (p[ind] == false) {
                while (st.size() > 0 && st.peek() > ch && li[st.peek() - 'a'] > i) {
                    p[(int) (st.peek() - 'a')] = false;
                    st.pop();
                }
                st.push(ch);
                p[ind] = true;
            }
        }

        StringBuilder sb = new StringBuilder("");
        while (st.size() > 0) {
            sb.append(st.pop());
        }
        return sb.reverse().toString();
    }
}