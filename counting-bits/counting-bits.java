/**
1 : range = 1
2~3 : range = 2
4~7 : range = 4
8~15 : range = 8
*/

class Solution {
    public int[] countBits(int n) {
        int dp[] = new int[n+1];
        int range = 1;
        dp[0] = 0;
        for(int i=1;i<=n;i++){
            dp[i] = dp[i-range] + 1;
            if(i+1 == range*2){
                range *= 2;
            }
        }
        return dp;
    }
}