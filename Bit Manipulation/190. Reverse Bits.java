https://leetcode.com/problems/reverse-bits/description/

public class Solution {
    // you need treat n as an unsigned value
    public int reverseBits(int n) {
        int result = 0;
        for (int i = 0; i < 32; i++) {
            result <<= 1; // Left shift result to make space for the next bit
            result |= (n & 1); // Append last bit of n to result
            n >>>= 1; // Shift n right to process the next bit
        }
        return result;
    }
}
