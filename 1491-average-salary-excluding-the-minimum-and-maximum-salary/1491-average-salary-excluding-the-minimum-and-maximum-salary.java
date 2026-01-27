class Solution {
    public double average(int[] sal) {
        int i, sum = 0;
        int max = sal[0];
        int min = sal[0];
        for (i = 0; i < sal.length; i++) {
            if (min > sal[i]) {
                min = sal[i];
            }
            if (max < sal[i]) {
                max = sal[i];
            }
            sum = sum + sal[i];
        }
        sum = sum - max - min;
        double ans = (double) sum / (sal.length - 2);
        return ans;
    }
}