package guanweizheng.jz_47_sumSpecialSolution;

//        思路： 递归  和 二目运算 结合方法

public class Solution2 {
    public int Sum_Solution(int n) {
        return n > 0 ? n + Sum_Solution(n-1) : n ;
    }
}
