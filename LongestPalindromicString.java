// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class Solution {
    int max, start, end;
    public String longestPalindrome(String s) {
        if(s == null || s.length() == 0) return null;

        for(int i = 0; i < s.length(); i++) {
            expandAroundCenter(s, i, i);
            if(i <= s.length()-1){
                expandAroundCenter(s, i, i+1);
            }
        }
        return s.substring(start, end+1);
    }

    private void expandAroundCenter(String s, int left, int right) {

        while(left>=0 && right<s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }

        left++;
        right--;

        if(max<right-left+1) {
            max = right-left+1;
            start = left;
            end = right;
        }


    }


}