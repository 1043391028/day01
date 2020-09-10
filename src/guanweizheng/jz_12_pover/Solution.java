package guanweizheng.jz_12_pover;

public class Solution{
//    最暴力简单的做法:直接运算，时间复杂度为N，空间复杂度为 1；
    public double pow1(double b,int n){
        if(n<0){
            b = 1/b ;
            n = -n;
        }
        double result = 1;
        for (int i=0;i<n;i++){
            result *=b;
        }
        return result;
    }
//    方法2：奇数次方和偶数次方，递归实现
//      时间复杂度：O(logn)，每次规模减少一半
//      空间复杂度：O(logn)，递归栈，因为要记住logn个变量
//
    public double qpow(double base,int n){
        if (n == 0) return 1;
        double result = qpow(base,n/2);
        if( (n & 1)==1 ) {

            return base*result *result;
        }
        else {
                return result *result;
        }

    }
    public double pow2(double base,int n) {
        if(n<0){
            base = 1/base ;
            n=-n;
        }
        return qpow(base,n);
    }

//    方法3：遍历幂次的二进制位，如x的6次方，6-->110--->2^1+2^2....二进制位为1才计算：x^2^1 * x^2^2 = x^6;
//    位数判断是1，则*,不为1，则不*；
            public double Power3(double base, int exponent) {
                if(exponent < 0 ){
                    base = 1/base;
                    exponent = -exponent;
                }
                double result = 1,temp = base;  // 依次记录x^0, x^1, x^2 ..
                while(exponent!=0){
                    if((exponent&1)== 1){
                        result *= temp;  // 二进制位数是1的，乘进答案。
                    }
                    temp *=temp;   // 每循环一次，即exponent每右移一位，幂次*2；
                    exponent >>=1;
                }

                return result;

            }

    public static void main(String[] args) {
        int n=5;
        double base =2;
        Solution solution = new Solution();
        double result1 = solution.pow1(base,n);
        double result2 = solution.pow2(base,n);
        double result3 = solution.Power3(base,n);

        System.out.println("结果为："+ result1);
        System.out.println("结果为："+ result2);
        System.out.println("结果为："+ result3);

    }

}
