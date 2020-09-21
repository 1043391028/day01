package guanweizheng.jz_38_TreeDeepth;

public class Test {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(8);
        TreeNode r1 = new TreeNode(06);
        TreeNode r2 = new TreeNode(10);
        root.left = r1;
        root.right = r2;


        TreeNode r3 = new TreeNode(5);
        TreeNode r4 = new TreeNode(07);
        TreeNode r5 = new TreeNode(9);
        TreeNode r6 = new TreeNode(11);
        r1.left = r3;
        r1.right = r4;
        r2.left = r5;
        r2.right = r6;

        Solution solution = new Solution();
        int deep1 = solution.TreeDeepth1(root);
        int deep2 = solution.TreeDeepth2(root);
        System.out.println("树的深度为："+deep1);
        System.out.println("树的深度为："+deep2);
    }
}
