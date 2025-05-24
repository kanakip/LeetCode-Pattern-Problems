https://leetcode.com/problems/sum-of-two-integers/description/

public class Solution {
    public int getSum(int a, int b) {
        while (b != 0) {
            int carry = a & b;  // Find carry bits
            a = a ^ b;          // XOR adds without carrying
            b = carry << 1;     // Shift carry left for next addition
        }
        return a;
    }
}
