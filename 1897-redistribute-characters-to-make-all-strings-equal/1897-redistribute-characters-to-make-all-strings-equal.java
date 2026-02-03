class Solution {
    public boolean makeEqual(String[] word) {
        int i, j, ind;
        int f[] = new int[26];
        for (i = 0; i < word.length; i++) {
            String w = word[i];

            for (j = 0; j < w.length(); j++) {
                char ch = w.charAt(j);
                ind = (int) (ch - 'a');

                f[ind] = f[ind] + 1;
            }
        }
        for (i = 0; i < 26; i++) {
            if (f[i] % word.length != 0) {
                return false;
            }
        }
        return true;
    }
}