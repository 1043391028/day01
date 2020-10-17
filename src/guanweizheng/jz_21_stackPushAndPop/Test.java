package guanweizheng.jz_21_stackPushAndPop;

public class Test {
    public static void main(String[] args) {
        int[] pushA = {1,2,3,4,5};
        int[] popA = {4,5,3,2,1};
        Solution solution = new Solution();
        Boolean aBoolean;

       aBoolean = solution.IsPopOrder(pushA,popA);

        System.out.println("输出结果为："+aBoolean);
    }
}
