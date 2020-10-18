package guanweizheng.jz_23_judgeBinaryTreeAfterOrfer;

public class Test {
    public static void main(String[] args) {
        int [] sequence1 = {2,4,3,6,9,8,5};
        int [] sequence2 = {2,4,3,7,6,9,8,5};
        int [] sequence3 = {2,4,3,7,6,10,9,8,5};
        int [] sequence4 = {2,4,3,7,6,10,9,8,5,12};
        int [] sequence5 = {5,8,3,4,6,9,2,7};
        Solution solution = new Solution();

        boolean bl1,bl2,bl3,bl4,bl5;
        bl1 = solution.VerifySquenceOfBST(sequence1);
        bl2 = solution.VerifySquenceOfBST(sequence2);
        bl3 = solution.VerifySquenceOfBST(sequence3);
        bl4 = solution.VerifySquenceOfBST(sequence4);
        bl5 = solution.VerifySquenceOfBST(sequence5);

        System.out.println("返回的结果是："+bl1);
        System.out.println("返回的结果是："+bl2);
        System.out.println("返回的结果是："+bl3);
        System.out.println("返回的结果是："+bl4);
        System.out.println("返回的结果是："+bl5);
    }
}
