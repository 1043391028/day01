package guanweizheng.jz_48_addSpacial;

//       思路 : 也是利用位运算符 '^'  '&'  '<<'  ; 不过换种递归和双目运算形式

public class Solution2 {
    public int add(int num1, int num2){

        return num2 == 0 ? num1 : add(num1 ^ num2, (num1 & num2) << 1);
    }


}
