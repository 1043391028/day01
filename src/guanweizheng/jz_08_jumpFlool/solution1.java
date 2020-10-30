package guanweizheng.jz_08_jumpFlool;

//     题目：一只青蛙一次可以跳上1级台阶，也可以跳上2级。
//           求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。

//     思路一：递归解法；

public class solution1 {
        public int JumpFloor(int n) {
            if (n == 1) return 1;
            if (n == 2) return 2;
            return JumpFloor(n - 1) + JumpFloor(n - 2);
        }
}
