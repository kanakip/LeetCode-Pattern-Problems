https://leetcode.com/problems/number-of-1-bits/


class Solution {
    public int hammingWeight(int n) {
         int count = 0;
        while (n != 0) {
            count += (n & 1); // Check the last bit
            n >>>= 1; // Unsigned right shift
        }
        return count;
    }
}

// IT start from right to left
// n (Binary)	n & 1	Count Increment	n >>> 1 (New n)
// 1011	1	+1	0101
// 0101	1	+1	0010
// 0010	0	No Change	0001
// 0001	1	+1	0000 (Stop)


// Step 1:  1011 & 0001 → 1 (count = 1), 1011 >> 1 → 0101
// Step 2:  0101 & 0001 → 1 (count = 2), 0101 >> 1 → 0010
// Step 3:  0010 & 0001 → 0 (count = 2), 0010 >> 1 → 0001
// Step 4:  0001 & 0001 → 1 (count = 3), 0001 >> 1 → 0000 (stop)
// Final Count: **3 ones**
