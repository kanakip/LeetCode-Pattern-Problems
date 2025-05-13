// https://leetcode.com/problems/happy-number/description/
// 202. Happy Number
class Solution {
    public boolean isHappy(int n) {
        int slow = n;
        int fast = getSumOfSquares(n);

        while (fast != 1 && slow != fast) {
            slow = getSumOfSquares(slow);        // Move slow by 1 step
            fast = getSumOfSquares(getSumOfSquares(fast)); // Move fast by 2 steps
        }

        return fast == 1;
    }

    private int getSumOfSquares(int n) {
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;
            sum += digit * digit;
            n /= 10;
        }
        return sum;
    }

}
