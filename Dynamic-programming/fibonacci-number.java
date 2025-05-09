

// 509. Fibonacci Number
// https://leetcode.com/problems/fibonacci-number/?envType=problem-list-v2&envId=dynamic-programming

class Solution {
    public int fib(int n) {
       if (n == 0) {
            return 0; // Base case: F(0)
        } else if (n == 1) {
            return 1; // Base case: F(1)
        }

        int a = 0, b = 1, result = 0;

        for (int i = 2; i <= n; i++) {
            result = a + b; // F(n) = F(n-1) + F(n-2)
            a = b;          // Update F(n-2)
            b = result;     // Update F(n-1)
        }

        return result; 
    }
}
