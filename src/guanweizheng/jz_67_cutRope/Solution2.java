package guanweizheng.jz_67_cutRope;

//        思路2：贪心算法：
//               把值为 Target 的目标值分解最大乘积：Math.power(n.i - c)*Math.power(n+1,c)
//               其中 i 为切割的段数，n 为切割的长度， c 为余数；

public class Solution2 {
    public int cutCrop(int target){

        if(target <= 1) return 0;
        if(target == 2) return 1;
        if(target == 3) return 2;
        int max = 0;
        for(int i = 2; i < target ; i++ ){
            int n = target/i , m = target % i;
            max = (int) Math.max(max,Math.pow(n, i-m)*Math.pow(n+1,m));
        }
        return max;
    }
}
