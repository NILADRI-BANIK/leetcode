class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int s = 0, e = people.length - 1, count = 0;
        while (s <= e) {
            if (people[s] + people[e] <= limit) {
                s++;
                e--;
            } else {
                e--;
            }
            count++;
        }
        return count;
    }
}