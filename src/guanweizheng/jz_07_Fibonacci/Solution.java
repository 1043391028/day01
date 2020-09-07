package guanweizheng.jz_07_Fibonacci;


public class Solution {
    //   递归实现斐波那契数列
    int Fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else return Fibonacci(n-2) + Fibonacci(n - 1);
    }
    //   优化递归，用数组实现，实现把数据保存起来，最后输出n;
    int Fibonacci1(int n){
        int ans[]=new int[40];
        ans[0] = 0;
        ans[1] = 1;
        for(int i=2;i<=39;i++){
            ans[i]=ans[i-1]+ans[i-2];
        }
        return ans[n];
    }
//    数组实现使用了大量空间，实际上并不需要，只需要分配好我们要的n值前的两个数
    int Fibonacci2(int n){
        if(n <= 1){
            return n;
        }
        int sum = 0;
        int first= 0;
        int second= 1;
        for(int i=2;i<=n;i++){
            sum = first + second;
            first = second;
            second = sum;
        }
        return sum;
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        int n = 15;
        int sum = solution.Fibonacci(n);
        int sum1 = solution.Fibonacci1(n);
        int sum2 = solution.Fibonacci2(n);
        System.out.println("整数" + n + "的斐波那契数和为：" + sum);
        System.out.println("整数" + n + "的斐波那契数和为：" + sum1);
        System.out.println("整数" + n + "的斐波那契数和为：" + sum2);
    }

}