package guanweizheng.jz_11_numberOf1;

public class Solution {
//    方法一：巧妙的方法：十进制数n与它本身n-1的值做&运算可以得到它二进制数最右边数字1变为0的二进制数
//    如：11001000 减去1得到 11000111，然后二者&运算得到 11000000，依次进行运算，直至n为0；期间记录做&运算的次数，记录为count;
    public int NumberOf1(int n) {
        int count = 0;
        while(n != 0){
            count++;
            n = n&(n -1);
        }
        return count ;
    }

    // 方法二:利用数组和字符串来解决；
//    1、先将数字转换成二进制字符串
//    2、用String.split()函数存入一个数组中
//    3、遍历数组跟1比较，同时计数
//    4、输出计数值

    // 注意; 负数的左移右移注意：1)负数的右移：负数右移的话，由于要保持它是负数，所以负数的二进制的右边补1。
    // 如果一直右移的话，最后就就变成0xFFFFFFFF 即-1
    //如： -4>>1 为-2 ；-4>>2为-1
    //2)负数的左移：跟正整数左移一样，右边补0，一直左移的话，最后就是0啦。-1<<2 为-4 ； -1<<31为0
    public int NumberOf12(int n){
        String s = Integer.toBinaryString(n);
        String split[] = s.split("");
        int a=0;
        for(int i = 0; i < split.length; i++) {
            if (split[i].equals("1"))
            {
                a++;
            }
        }
        return a;
    }

    public static void main(String[] args) {
        int n = 430;
        Solution solution = new Solution();
        int number = solution.NumberOf1(n);
        int number1 = solution.NumberOf12(n);
        System.out.println("十进制数n的二进制数中1的个数为："+number);
        System.out.println("十进制数n的二进制数中1的个数为："+number1);
    }
}
