package guanweizheng.jz_67_cutRope;
//
//      题目描述：给你一根长度为n的绳子，请把绳子剪成整数长的m段（m、n都是整数，n>1并且m>1，m<=n），
//               每段绳子的长度记为k[1],...,k[m]。请问k[1]x...xk[m]可能的最大乘积是多少？例如，当绳子的长度是8时，
//               我们把它剪成长度分别为2、3、3的三段，此时得到的最大乘积是18。
//         思路1：利用数学公式，求导可得，分段绳子，每段长度为 3 时，分段乘积最大；
//                分段后，分为三种情况：
//             1.   整除；长度为“3”段数：target/3     最大乘积：3^（target/3）；
//             2.   余 1；长度为“3”段数：target/3-1   最大乘积：3^(target/3 - 1)*2*2;
//                        相当于把最后一段长度为“3”的段和余的段“1”合并，然后分解为2*2；
//             3.   余 2；长度为“3”段数：target/3    最大乘积：3^(target/3)*2;

public class Solution1 {
    public int cutRope(int target) {
        if(target <= 1) return 0;
        if(target == 2) return 1;
        if(target == 3) return 2;
        int tag = target % 3;
        switch(tag){
            case 0 :
                return (int )Math.pow(3,tag);
            case 1 :
                return ((int)Math.pow(3,tag-1)*2*2);
            case 2:
                return (int)Math.pow(3,tag)*2;
        }
        return 0;
    }
}
