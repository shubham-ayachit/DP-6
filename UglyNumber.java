// Time Complexity : O(n)
// Space Complexity : O(n)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :

class Solution {
    public int nthUglyNumber(int n) {

        if(n == 1) return n;

        int[] results = new int[n];
        int p2 = 0, p3 = 0, p5 = 0;
        int n2 = 2, n3 = 3, n5 = 5;

        results[0] = 1;

        for(int i = 1; i<n; i++) {
            int min = Math.min(n2, Math.min(n3, n5));
            results[i] = min;
            if(min == n2) {
                p2++;
                n2 = 2*results[p2];
            }
            if(min == n3) {
                p3++;
                n3 = 3*results[p3];
            }
            if(min == n5) {
                p5++;
                n5 = 5*results[p5];
            }
        }
        return results[n-1];
    }
}

//T.C = O(n)
//S.C = O(n)