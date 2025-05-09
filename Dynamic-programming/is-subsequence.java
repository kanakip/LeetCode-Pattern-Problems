// 392. Is Subsequence
// https://leetcode.com/problems/is-subsequence/description/?envType=problem-list-v2&envId=dynamic-programming

class Solution {
    public boolean isSubsequence(String s, String t) {
        
        if(s.length()==0)
        {
            return true;
        }

        int i=0,j=0;

        while(i<s.length() && j<t.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            }else{
                j++;
            }

            if(s.length()==i){
                return true;
            }
           
        }
         return false;
    }
}
