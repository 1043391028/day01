package guanweizheng.jz_67_cutRope;
//      动态规划：
//              使用数组dp[i]来保存,分段长度为 i 时的最大乘积，依次给出 i = 1，2，3时最大乘积，
//              然后由 i= 4开始推，逐渐分解成这三个，依次可求出所有值；

public class Solution3 {
    public int cutRope(int target) {
        if(target <= 1) return 0;
        if(target == 2) return 1;
        if(target == 3) return 2;
//      动态规划，先开辟数组空间，保存动态过程数据，dp[i]表示分段长度为i时，最大乘积数据；
        int [] dp =new int [target+1];
//      这里需要注意，分段长度分别为 1，2，3 时，不用再分割，值最大；
        dp[1] = 1;
        dp[2] = 2;
        dp[3] = 3;

        for(int i = 4 ;i <= target ;i++){
            int max = 0;
            for(int j = 2;j <= i/2;j++){
                max = Math.max(max,dp[j]*dp[i-j]);
            }
            dp[i] = max;
        }
        return dp[target];
    }

}
