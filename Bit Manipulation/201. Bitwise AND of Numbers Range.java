https://leetcode.com/problems/bitwise-and-of-numbers-range/

class Solution {
    public int rangeBitwiseAnd(int left, int right) {
        while (left < right) {
            right = right & (right - 1); // Remove the last set bit of 'right'
        }
        return right;
    }
}
