package guanweizheng.jz_31_NumberOf1Between1AndN;

//      题目描述：求出1~13的整数中1出现的次数,并算出100~1300的整数中1出现的次数？为此他特别数了一下1~13中包含1的数字有
//                1、10、11、12、13因此共出现6次,但是对于后面问题他就没辙了。ACMer希望你们帮帮他,并把问题更加普遍化,
//                 可以很快的求出任意非负整数区间中1出现的次数（从1 到 n 中1出现的次数）

//          思路：分别求出每位数（个位，十位，百位。。。。）出现‘1’的个数
public class Solution {
    public int NumberOf1Between1AndN_Solution(int n) {
        int sum = 0;
        for(int m = 1; m <= n;m *= 10){
            int high = n/m ,low = n % m ;
            sum += (high+8)/10*m + (high%10 == 1 ? low+1 : 0);
        }
        return sum;
    }
}
