package guanweizheng.jz_51_multyply;

//题目: 给定一个数组A[0,1,...,n-1],请构建一个数组B[0,1,...,n-1],其中B中的元素B[i]=A[0]*A[1]*...*A[i-1]*A[i+1]*...*A[n-1]。
//      不能使用除法。（注意：规定B[0] = A[1] * A[2] * ... * A[n-1]，B[n-1] = A[0] * A[1] * ... * A[n-2];）
//           对于A长度为1的情况，B无意义，故而无法构建，因此该情况不会存在。

//思路:  分两轮循环遍历A[],
//       第一轮: 下标 从小到大, 计算,i位置前面的乘积,并保存到新数组 b[i] 中;
//       第二轮:  下标从大到小, 用上一轮循环保留下来的 b[i] 再 * 下标[i] 之后的,便可得到结果;
//              具体过程如下:

public class Solution {
    public int[] multiply(int[] A) {

        int[] b = new int[A.length];
        int res = 1;
//         第一轮循环:
        for (int i = 0; i < A.length; i++) {
            b[i] = res;
            res *= A[i];  // 依次保留A[i] 前面元素乘积 值 ;
        }
        res = 1;
        for (int i = A.length - 1; i >= 0; i--) {
            b[i] *= res;
            res *= A[i];  // 依次保留A[i] 后面元素的乘积值;
        }
        return b;
    }
}
