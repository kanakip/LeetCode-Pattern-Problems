https://leetcode.com/problems/single-number-iii/description/

class Solution {
    public int[] singleNumber(int[] nums) {
          int xor = 0;
        for (int num : nums) {
            xor ^= num; // XOR cancels out duplicate numbers
        }

        // Find the rightmost set bit (difference between the two unique numbers)
        int diffBit = xor & -xor;
        int a = 0, b = 0;

        // Divide numbers into two groups based on the diffBit
        for (int num : nums) {
            if ((num & diffBit) == 0) {
                a ^= num;
            } else {
                b ^= num;
            }
        }
        return new int[]{a, b};
    }
}
