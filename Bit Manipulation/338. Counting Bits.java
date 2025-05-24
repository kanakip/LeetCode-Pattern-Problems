https://leetcode.com/problems/counting-bits/description/

class Solution {
    public int[] countBits(int n) {
     int[] result = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            result[i] = result[i & (i - 1)] + 1; // Uses previously computed values
        }
        return result;
    }
}
