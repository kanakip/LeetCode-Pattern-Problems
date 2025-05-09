// 70. Climbing Stairs
// https://leetcode.com/problems/climbing-stairs/description/?envType=problem-list-v2&envId=dynamic-programming

class Solution {
    public int climbStairs(int n) {

        if(n<3){
            return n;
        }

        int a=3,b=2;

        for(int i=0;i<n-3;i++){
            a=a+b;
            b=a-b;
        }
        return a;
        
    }
}
