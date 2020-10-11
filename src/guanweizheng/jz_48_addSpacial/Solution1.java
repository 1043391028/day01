package guanweizheng.jz_48_addSpacial;

//         题目: 写一个函数，求两个整数之和，要求在函数体内不得使用+、-、*、/四则运算符号。
//       思路一: 位运算符 '&' 和'<<' 可以计算进位符, '^' (异或) 运算符可以计算两个二进制数无进位结果;

public class Solution1 {
    public int add(int num1, int num2){
        int temp = 0;
        while(num2 != 0){
            temp = (num1 & num2)<<1;  //进位运算, 结果只保留进位;
            num1 = num1 ^num2;  //  无进位运算结果无进位
            num2 = temp;   // 若进位 b 为 0 ,则结束,不为0,继续下一轮相加,直至进位 b 为0
        }
        return num1;
    }

}
