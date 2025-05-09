
// 918. Maximum Sum Circular Subarray
// https://leetcode.com/problems/maximum-sum-circular-subarray/?envType=problem-list-v2&envId=dynamic-programming

class Solution {
    public int maxSubarraySumCircular(int[] nums) {
      int maxSum = kadane(nums); // Case 1: Non-circular max subarray sum
        int totalSum = 0, minSum = 0, curMin = 0;
        for (int num : nums) {
            totalSum += num;
            curMin = Math.min(curMin + num, num);
            minSum = Math.min(minSum, curMin);
        }
        return maxSum > 0 ? Math.max(maxSum, totalSum - minSum) : maxSum;
    }

    private int kadane(int[] nums) {
        int curMax = 0, maxSum = Integer.MIN_VALUE;
        for (int num : nums) {
            curMax = Math.max(curMax + num, num);
            maxSum = Math.max(maxSum, curMax);
        }
        return maxSum;
    }
}
