class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int ans = numBottles, remBottles, newBottles;
        while (numBottles >= numExchange) {
            newBottles = numBottles / numExchange;
            remBottles = numBottles % numExchange;
            ans = ans + newBottles;
            numBottles = newBottles + remBottles;
        }
        return ans;
    }
}