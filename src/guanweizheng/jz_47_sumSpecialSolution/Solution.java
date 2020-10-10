package guanweizheng.jz_47_sumSpecialSolution;

//       题目:  求1+2+3+...+n，要求不能使用乘除法、for、while、if、else、switch、case等关键字及条件判断语句（A?B:C）

//     思路一:  '&&' 运算符的运用;
//             表达式A && 表达式B  若A 错误,则不执行B;
//

public class Solution {
    public int sum(int n){
        boolean x = n > 1 && (n += sum(n - 1)) > 0;
        return n;
    }

}
