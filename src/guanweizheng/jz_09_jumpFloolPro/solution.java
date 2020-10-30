package guanweizheng.jz_09_jumpFloolPro;

//   题目： 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。

//    思路： 利用算数表达式 ，可以解出 跳上第 N 阶台阶方式 f（n）= 2f(n-1);
//           第一阶台阶F（1） = 1；从第二阶台阶开始计算，遍历阶数直到最后一个台阶；

public class solution {
    public int JumpFloorII(int target) {
        int sum = 1;
        for(int i = 2;i < target+1;i++ )
            sum = 2 * sum;
        return sum;
    }
}
